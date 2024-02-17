public class Student implements Comparable<Student>{
    private Long stodentId;
    private String firstName;
    private String lastName;
    private  String middleName;

    public Long getStodentId() {
        return stodentId;
    }

    public void setStodentId(Long stodentId) {
        this.stodentId = stodentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.stodentId.compareTo(o.stodentId);
    }
}
