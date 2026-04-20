fun main() {
    println(greet(Country.india))
    for(country in Country.entries){
        println(country.code)
    }
}

enum class Country(val code: String){
    germany ("GR"),
    france("FR"),
    usa("US"),
    india("IN"),
    japan("JP")
}

fun greet(country: Country): String{
    return when(country){
        Country.germany -> "Germany"
        Country.france -> "France"
        Country.usa -> "USA"
        Country.india -> "India"
        Country.japan -> "Japan"
    }
}
