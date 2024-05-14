public class Journal implements LibraryResource {
    private String title;
    private boolean isBorrowed;

    public Journal(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public void borrow(String studentId) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(studentId + " borrowed journal: " + title);
        } else {
            System.out.println("Journal already borrowed.");
        }
    }

    @Override
    public void returnResource(String studentId) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(studentId + " returned journal: " + title);
        } else {
            System.out.println("Journal was not borrowed.");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}