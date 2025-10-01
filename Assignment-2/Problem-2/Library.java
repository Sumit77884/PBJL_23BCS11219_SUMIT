public class Library {
    public void borrowBook(String bookTitle, int availableCopies, int userId, String userRole)
            throws BookNotAvailableException {

        if (bookTitle == null || bookTitle.isEmpty() || userRole == null || userRole.isEmpty()) {
            throw new NullPointerException("Book title or user role cannot be null or empty.");
        }

        if (availableCopies <= 0) {
            throw new BookNotAvailableException("Book not available for borrowing.");
        }

        if (userId < 0 || (!userRole.equalsIgnoreCase("student") && !userRole.equalsIgnoreCase("faculty"))) {
            throw new InvalidUserException("Invalid user credentials.");
        }

        System.out.println("Book '" + bookTitle + "' borrowed successfully by " + userRole + " (ID: " + userId + ").");
    }

    public void returnBook(String bookTitle, int userId) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            throw new NullPointerException("Book title cannot be null or empty.");
        }

        if (userId < 0) {
            throw new InvalidUserException("Invalid user ID.");
        }

        System.out.println("Book '" + bookTitle + "' returned successfully by User ID: " + userId + ".");
    }
}
