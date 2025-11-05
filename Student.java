import java.util.*

class Student implements Person {
    private String id;
    private String fullName;
    private String email;

    public Student(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return fullName + "(ID: " + id + ", " + email + ")";
    }
}