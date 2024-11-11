import java.util.Locale.Category

fun main() {
    
}

enum class Type {
    FREE, PAID
}

enum class ContentRating {
    EVERYONE, TEEN, MATURE 17+, ADULT
}

data class csvCats(
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