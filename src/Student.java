public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String fatherName;
    private String birthDate;
    private String adress;
    private String phoneNumber;
    private String facultyName;
    private byte courseNumber;
    private String groupName;

    public Student(int id, String lastName, String firstName, String fatherName, String birthDate, String adress, String phoneNumber, String facultyName, byte courseNumber, String groupName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.facultyName = facultyName;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public byte getCourseNumber() {
        return courseNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}