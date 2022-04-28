import java.text.SimpleDateFormat
import java.util.Date

val icons = mapOf(
    "01" to "\n" +
            "\n" +
            "\n" +
            "\n" +
            "                WWNNNNWW\n" +
            "            WNX0OkxxxxxkOKNW\n" +
            "           NKkddooooooooodxOXW\n" +
            "          NOdoooooooooooooodxKW\n" +
            "         W0doooooooooooooooookX\n" +
            "         XkoooooooooooooooooodKW\n" +
            "         NkoooooooooooooooooodKW        \n" +
            "         W0dodoooooooooooooodkN\n" +
            "          N0xooooooooooodoodkXW\n" +
            "           WXOxddoooooooddkKN\n" +
            "             WNK0OOOOOO0KXW\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n",
    "02" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                      WNXKKKKNW         \n" +
            "                WW WNXOxdddodxk0N       \n" +
            "             WWWWWWNX0doooooooodkX      \n" +
            "            WWWWWWWWWN0kOkxdooood0W     \n" +
            "           WWWWWWWWWWWNNWWXkdooodOW     \n" +
            "        WWWWWWWWWWWWWWWWWWWXOkddkXW     \n" +
            "       WWWWWWWWWWWWWWWWWWWWWWNXKXW      \n" +
            "       WWWWWWWWWWWWWWWWWWWWWWWWW        \n" +
            "        WWWWWWWWWWWWWWWWWWWWWWW         \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "03" to "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "               WWWWWW\n" +
            "             WWWWWWWWWW\n" +
            "             WWWWWWWWWWWWWWW\n" +
            "          WWWWWWWWWWWWWWWWWWW           \n" +
            "        WWWWWWWWWWWWWWWWWWWWWWW\n" +
            "        WWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "        WWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "           WWWWWWWWWWWWWWWWWWW\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n",
    "04" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                  WXKOkk0XW             \n" +
            "                 Nk:,,'',cONW           \n" +
            "            WWWWWN0o:,'''';looON        \n" +
            "           WWWWWWWWXKxccc;'''':kXW      \n" +
            "          WWWWWWWWWWWNXNN0l''',,:oK     \n" +
            "       WWWWWWWWWWWWWWWWWWW0o:,''';kW    \n" +
            "      WWWWWWWWWWWWWWWWWWWWWNXOoloON     \n" +
            "      WWWWWWWWWWWWWWWWWWWWWWWWWWW       \n" +
            "       WWWWWWWWWWWWWWWWWWWWWWW          \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "09" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                   NXK0KN               \n" +
            "                 WOc;;,;l0NWW           \n" +
            "             WWWWWKo:,'',:clkN          \n" +
            "            WWWWWWWX0Okxl,'';oOX        \n" +
            "          WWWWWWWWWWWWWWKo;,'',xW       \n" +
            "        WWWWWWWWWWWWWWWWWNKkolxK        \n" +
            "        WWWWWWWWWWWWWWWWWWWWWW          \n" +
            "          WWWN0KWWWWWWWWWWW             \n" +
            "            WKKNKKWNXKX                 \n" +
            "            XOXXOKNXXNW                 \n" +
            "              WXXWK0KN                  \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "10" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                      WNXXXNW           \n" +
            "                W  NXKkxdddxOXW         \n" +
            "              WWWWWNXOdooooooxKW        \n" +
            "             WWWWWWWWNK00kdoodON        \n" +
            "          WWWWWWWWWWWWWWWXOxdd0W        \n" +
            "         WWWWWWWWWWWWWWWWWNXKKW         \n" +
            "         WWWWWWNWWWWWWWWWWWWW           \n" +
            "           WWWX0XWWWWWNWWWWW            \n" +
            "             NKXN0KW NKN                \n" +
            "             KOXKOXNKXN                 \n" +
            "               WXXWKk0N                 \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "11" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                  N0kxdxOXW             \n" +
            "               W Nx;'''',cOXXW          \n" +
            "            WWWWWNKd:,'''';::l0W        \n" +
            "           WWWWWWWWX0kdxo:''',cx0W      \n" +
            "        WWWWWWWWWWWWWWWWWO:''''';kW     \n" +
            "       WWWWWWWWWWWWWWWWWWN0ko;,,:OW     \n" +
            "      WWWWWWWNK0KNWWWWWWWWWWNKO0XW      \n" +
            "       WWWWWN0dx0NWWWWWWWWWWWW          \n" +
            "         WWWKxdxKNWWWWWWWWWW            \n" +
            "           WNOkKW                       \n" +
            "           WXKNW                        \n" +
            "            W                           \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "13" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                  WXXN                  \n" +
            "              NNKkdlcdk0XN              \n" +
            "           WX0xoOOl;;cO0ddOKW           \n" +
            "           WOc;;o0d::d0d;;ckN           \n" +
            "           NkdkOxclxko:dOkxkN           \n" +
            "           NOddddloddolodddON           \n" +
            "           W0o::xXx::dXk::oOW           \n" +
            "           WNXOxOxc;;cxOxOXNW           \n" +
            "              WWX0Oddk0KWW              \n" +
            "                  WWWW                  \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        ",
    "50" to "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "              WKOOOOOOKW                \n" +
            "         WXKKK0kxxxxxxk0N               \n" +
            "         WK000OkkkkkkkkOKNNNNNNW        \n" +
            "         WWWWWX0OOOOOOOOOO00O00N        \n" +
            "        N0OOOOOOOOO0OOOO0XW             \n" +
            "         WWN0kkkkkkkkkkkkOOOKW          \n" +
            "           WNX0kxxxxxxxxk0XXNW          \n" +
            "              NXKKKKKKKKKN              \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        \n" +
            "                                        "
)

fun main() {
    println("Opening weather service and serializer...")
    val service = WeatherService()

    val zipCode = print("Done!\n\nPlease enter a zip code: ").run { readLine() }!!
    print("\nPlease wait. Getting location data...")

    service.getGeocodingFromZip(zipCode) { geocoding ->
        print("\nFound zip code, fetching weather...")
        service.getWeatherData(geocoding.lat, geocoding.lon) { weather ->
            println("\n\nDone! Select from the options below to start filtering weather data.")

            val date = Date()
            val current = weather.hourly.sortedBy { it.dt }.dropWhile { it.dt < date.toInstant().nano }.first()
            println(SimpleDateFormat().format(current.dt * 1000L))
            println(current)
            println(icons[current.weather.first().icon.take(2)])
        }
    }
}