import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

private const val APIKEY: String = "5115e1545a201817c9fe2dff17623a4b"

open class NetworkRequestQueue {
    var queue: HttpClient? = null

    fun openQueue() : Boolean {
        queue = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(
                    kotlinx.serialization.json.Json {
                        ignoreUnknownKeys = true
                        explicitNulls = false
                    }
                )
            }
            expectSuccess = true
        }
        return true
    }

    inline fun <reified T> makeRequest(url: String, crossinline callback: (T) -> Unit) { runBlocking { callback(queue!!.get(url)) } }
}

class WeatherService(private val requestQueue: NetworkRequestQueue = NetworkRequestQueue()) {
    init { requestQueue.openQueue() }

    fun getGeocodingFromZip(zip: String, block: (GeocodingResult) -> Unit) {
        requestQueue.makeRequest("https://api.openweathermap.org/geo/1.0/zip?zip=$zip,US&appid=$APIKEY", block)
    }
    fun getLocationData(lat: Double, lon: Double, block: (LocationResult) -> Unit) {
        requestQueue.makeRequest("https://api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$lon&units=imperial&appid=$APIKEY", block)
    }
    fun getWeatherData(lat: Double, lon: Double, block: (WeatherResult) -> Unit) {
        requestQueue.makeRequest("https://api.openweathermap.org/data/2.5/onecall?lat=$lat&lon=$lon&exclude=minutely,daily&units=imperial&appid=$APIKEY", block)
    }
}