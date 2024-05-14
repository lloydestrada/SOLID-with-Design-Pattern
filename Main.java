public class Main {
    public static void main(String[] args) {
        // Create the library and add resources
        Library library = new Library();
        library.addResource(new Book("Effective Java"));
        library.addResource(new Journal("IEEE Transactions"));
        library.addResource(new AudioBook("Clean Code"));

        // Create a student
        Student student = new Student("21-11345-835", "John Lloyd Estrada");

        // Borrow resources
        LibraryResource book = library.getResource("Effective Java", Book.class);
        LibraryResource journal = library.getResource("IEEE Transactions", Journal.class);
        LibraryResource audioBook = library.getResource("Clean Code", AudioBook.class);

        if (book != null) student.borrowResource(book);
        if (journal != null) student.borrowResource(journal);
        if (audioBook != null) student.borrowResource(audioBook);

        // Return resources
        if (book != null) student.returnResource(book);
        if (journal != null) student.returnResource(journal);
        if (audioBook != null) student.returnResource(audioBook);
    }
}