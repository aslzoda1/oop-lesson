abstract class Item(
    val id: Int,
    val title: String,
    var isAvailable: Boolean = true
) {
    // Abstract funksiya - har bir voris class o'zicha realizatsiya qiladi
    abstract fun displayInfo()

    fun borrow() {
        if (isAvailable) {
            isAvailable = false
            println("✅ '$title' muvaffaqiyatli band qilindi.")
        } else {
            println("❌ '$title' hozirda mavjud emas.")
        }
    }

    fun returnItem() {
        isAvailable = true
        println("♻️ '$title' kutubxonaga qaytarildi.")
    }
}