class Book(
    id: Int,
    title: String,
    val author: String
) : Item(id, title) {

    override fun displayInfo() {
        val status = if (isAvailable) "Mavjud" else "Band"
        println("[Kitob] ID: $id | Nomi: $title | Muallif: $author | Holati: $status")
    }
}