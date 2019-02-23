package quality.education.q1.Model;

public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private String projectIntrest;
    private String gender;
    private Integer age;

    public Student(Integer id, String firstName, String lastName, String projectIntrest, String gender, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.projectIntrest = projectIntrest;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getProjectIntrest() {
        return projectIntrest;
    }

    public void setProjectIntrest(String projectIntrest) {
        this.projectIntrest = projectIntrest;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", projectIntrest='" + projectIntrest + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
