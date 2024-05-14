public interface LibraryResource {
    void borrow(String studentId);
    void returnResource(String studentId);
    String getTitle();
}