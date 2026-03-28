fun main() {
    val myLibrary = Library()

    // Ma'lumotlar
    myLibrary.addItem(Book(1, "O'tkan Kunlar", "Abdulla Qodiriy"))
    myLibrary.addItem(Book(2, "Sariq devni minib", "Xudoyberdi To'xtaboyev"))
    myLibrary.addItem(Book(3, "Atomic Habits", "James Clear"))

    // Ro'yxat
    myLibrary.showAllItems()

    // Kitob olish
    val book = myLibrary.findItemById(1)
    book?.borrow()

    // Holatni tekshirish
    myLibrary.showAllItems()

    // Qaytarish
    book?.returnItem()
    myLibrary.showAllItems()
}