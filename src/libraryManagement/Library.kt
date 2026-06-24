package libraryManagement

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun borrowBook(id: Int) {
        val book = books.find { it.id == id }

        if (book == null) {
            println("Book not found")
        } else if (book.borrow()) {
            println("Borrowed: ${book.title}")
        } else {
            println("${book.title} is already borrowed")
        }
    }

    fun returnBook(id: Int) {
        val book = books.find { it.id == id }

        if (book != null) {
            book.returnBook()
            println("Returned: ${book.title}")
        }
    }

    fun showAvailableBooks() {
        println("\nAvailable Books:")
        books.filter { !it.isBorrowed }
            .forEach { println("${it.id} - ${it.title} by ${it.author}") }
    }

    fun showAllBooks() {
        println("\nAll Books:")
        books.forEach {
            val status = if (it.isBorrowed) "Borrowed" else "Available"
            println("${it.id} - ${it.title} ($status)")
        }
    }
}