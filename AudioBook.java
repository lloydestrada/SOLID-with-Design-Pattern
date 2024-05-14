public class AudioBook implements LibraryResource {
    private String title;
    private boolean isBorrowed;

    public AudioBook(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public void borrow(String studentId) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(studentId + " borrowed audiobook: " + title);
        } else {
            System.out.println("Audiobook already borrowed.");
        }
    }

    @Override
    public void returnResource(String studentId) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(studentId + " returned audiobook: " + title);
        } else {
            System.out.println("Audiobook was not borrowed.");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}