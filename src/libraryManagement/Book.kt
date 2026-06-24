package libraryManagement

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    var isBorrowed: Boolean = false
) : Borrowable {

    override fun borrow(): Boolean {
        return if (!isBorrowed) {
            isBorrowed = true
            true
        } else {
            false
        }
    }

    override fun returnBook() {
        isBorrowed = false
    }
}