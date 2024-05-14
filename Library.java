import java.util.*;
public class Library {
    private Map<String, LibraryResource> resources;

    public Library() {
        resources = new HashMap<>();
    }

    public void addResource(LibraryResource resource) {
        resources.put(getResourceKey(resource), resource);
    }

    public LibraryResource getResource(String title, Class<? extends LibraryResource> resourceType) {
        return resources.get(getResourceKey(title, resourceType));
    }

    private String getResourceKey(LibraryResource resource) {
        return getResourceKey(resource.getTitle(), resource.getClass());
    }

    private String getResourceKey(String title, Class<? extends LibraryResource> resourceType) {
        return title + "-" + resourceType.getSimpleName();
    }
}