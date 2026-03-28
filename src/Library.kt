class Library {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun showAllItems() {
        println("\n--- Kutubxona Ro'yxati ---")
        if (items.isEmpty()) println("Kutubxona bo'sh.")
        items.forEach { it.displayInfo() }
        println("---------------------------\n")
    }

    fun findItemById(id: Int): Item? {
        return items.find { it.id == id }
    }
}