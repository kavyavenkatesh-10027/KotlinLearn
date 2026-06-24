package libraryManagement

fun main() {
    val library = Library()

    library.addBook(Book(1, "Clean Code", "Robert Martin"))
    library.addBook(Book(2, "Kotlin in Action", "Dmitry Jemerov"))
    library.addBook(Book(3, "Atomic Habits", "James Clear"))

    library.showAllBooks()

    library.borrowBook(2)

    library.showAvailableBooks()

    library.returnBook(2)

    library.showAllBooks()
}