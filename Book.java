public class Book implements LibraryResource {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public void borrow(String studentId) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(studentId + " borrowed book: " + title);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    @Override
    public void returnResource(String studentId) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(studentId + " returned book: " + title);
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}