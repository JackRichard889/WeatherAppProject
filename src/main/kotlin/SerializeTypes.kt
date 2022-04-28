@kotlinx.serialization.Serializable
data class WeatherTemperature(
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Int,
    val humidity: Int
)

@kotlinx.serialization.Serializable
data class WeatherForecast(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

@kotlinx.serialization.Serializable
data class WeatherClouds(
    val all: Int
)

@kotlinx.serialization.Serializable
data class WeatherWind(
    val speed: Double,
    val deg: Int
)

@kotlinx.serialization.Serializable
data class WeatherTime(
    val type: Int,
    val id: Int,
    val message: Double?,
    val country: String,
    val sunrise: Int,
    val sunset: Int
)

@kotlinx.serialization.Serializable
data class WeatherCoordinates(
    val lat: Double,
    val lon: Double
)

@kotlinx.serialization.Serializable
data class LocationResult(
    val coord: WeatherCoordinates,
    val base: String,
    val dt: Int,
    val timezone: Int,
    val id: Int,
    val name: String,
    val cod: Int,
    val sys: WeatherTime
)

@kotlinx.serialization.Serializable
data class GeocodingResult(
    val zip: String,
    val name: String,
    val lat: Double,
    val lon: Double,
    val country: String
)

@kotlinx.serialization.Serializable
data class WeatherResult(
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val timezone_offset: Int,
    val current: CurrentWeather,
    val hourly: List<HourlyWeather>,
    val alerts: List<WeatherAlert>?
)

@kotlinx.serialization.Serializable
data class RainChance(
    val `1h`: Double
)

@kotlinx.serialization.Serializable
data class CurrentWeather(
    val dt: Int,
    val sunrise: Int,
    val temp: Double,
    val feels_like: Double,
    val pressure: Int,
    val humidity: Int,
    val dew_point: Double,
    val uvi: Double,
    val clouds: Int,
    val visibility: Int,
    val wind_speed: Double,
    val wind_deg: Int,
    val weather: List<WeatherForecast>,
    val rain: RainChance?
)

@kotlinx.serialization.Serializable
data class HourlyWeather(
    val dt: Int,
    val temp: Double,
    val feels_like: Double,
    val pressure: Int,
    val humidity: Int,
    val dew_point: Double,
    val uvi: Double,
    val clouds: Int,
    val visibility: Int,
    val rain: RainChance?,
    val wind_speed: Double,
    val wind_deg: Int,
    val wind_gust: Double,
    val weather: List<WeatherForecast>,
    val pop: Double
)

@kotlinx.serialization.Serializable
data class WeatherAlert(
    val sender_name: String,
    val event: String,
    val start: Int,
    val end: Int,
    val description: String,
    val tags: List<String>
)