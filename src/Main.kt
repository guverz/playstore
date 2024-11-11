import java.util.Locale.Category

fun main() {
    val csvFile = readCsv("E:/Workbench/kotlin/playstore/googleplaystore.csv")
    println(csvFile)
    val num = "string"
    println(num)
    pr1ntln(2)
}

enum class Type {
    FREE, PAID
}

enum class ContentRating {
    EVERYONE, TEEN, MATURE 17+, ADULT
}

data class CsvCats(
    val name: String,
    val category: String,
    val rating: Float,
    val reviews: Int,
    val size: String,
    val installs: String,
    val type: Type,
    val price: Double,
    val contentRating: ContentRating,
    val genres: String,
    val lastUpdate: Date,
    val currentVer: String,
    var androidVer: String,
)

fun readCsv(inputStream: InputStream): List<CsvCats> {
    val reader = inputStream.bufferedReader()
    val header = reader.readLine()
    return reader.lineSequence()
        .filter { it.isNotBlank() }
        .map {
            val (
                name, category, rating, reviews, size, installs, type, price, contentRating, genres, lastUpdate, currentVer, androidVer
            ) = it.split(',', ignoreCase = false, limit = 13)
            CsvCats(
                name.trim().removeSurrounding("\""),
                category.trim().removeSurrounding("\""),
                rating.trim().toFloat(),
                reviews.trim().toInt(),
                size.trim().removeSurrouding("\""),
                installs.trim().removeSurrounding("\""),


                Year.of(year.trim().toInt()),
                rating.trim().toInt(),
                title.trim().removeSurrounding("\"")
            )
        }.toList()
}