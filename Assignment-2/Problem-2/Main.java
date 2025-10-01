public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Valid borrow
        try {
            library.borrowBook("Java Programming", 5, 101, "student");
        } catch (BookNotAvailableException | InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Borrow when no copies are available
        try {
            library.borrowBook("Data Structures", 0, 102, "faculty");
        } catch (BookNotAvailableException | InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Borrow with invalid user ID
        try {
            library.borrowBook("Algorithms", 2, -1, "student");
        } catch (BookNotAvailableException | InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Borrow with invalid role
        try {
            library.borrowBook("Databases", 3, 103, "guest");
        } catch (BookNotAvailableException | InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Return a book successfully
        try {
            library.returnBook("Operating Systems", 104);
        } catch (InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Trigger NullPointerException (null title)
        try {
            library.returnBook(null, 105);
        } catch (InvalidUserException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
