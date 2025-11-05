class KLTN <T extends Student, V extends Person> implements Comparable<KLTN<?,?>> {
    private T student;
    private V supervisor;
    private String title;

    public KLTN(T student, V supervisor, String title) {
        this.student = student;
        this.supervisor = supervisor;
        this.title = title;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(KLTN<?,?> next) {
        if (next == null) return 1; // kltn đứng trước
        if (next.title == null && this.title = null) return 0; // = nhau
        if (this.title == null) return -1; //kltn đứng sau
        if (next.title == null) return 1;

        char a = this.title.toLowerCase().charAt(0);
        char b = this.title.toLowerCase().charAt(0);
        if (a != b) return a - b;
        return this.title.toLowerCase().compareTo(other.title.toLowerCase());
    }

    @Override
    public String toString() {
        String supervisorin4 = supervisor.toString();

        return "Title: " + title + "\n"
            + " Student: " + student + "\n"
            + " Supervisor: " + supervisorin4 + "\n";
    }
}