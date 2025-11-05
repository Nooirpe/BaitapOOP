public class Teacher implements Person {
    private String fullName;
    private String id;
    private String email;
    private String title;

    public Teacher(String fullName, String id, String email, String title) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.title = title;
    }

    // Không có set vì đối tượng này k cần thay đổi

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return fullName + "(ID: " + id + ", " + email + ", " + title + ")";
    }
}