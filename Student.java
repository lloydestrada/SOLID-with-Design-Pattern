import java.util.*;
public class Student {
    private String id;
    private String name;
    private List<LibraryResource> borrowedResources;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(LibraryResource resource) {
        resource.borrow(id);
        borrowedResources.add(resource);
    }

    public void returnResource(LibraryResource resource) {
        resource.returnResource(id);
        borrowedResources.remove(resource);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<LibraryResource> getBorrowedResources() {
        return borrowedResources;
    }
}