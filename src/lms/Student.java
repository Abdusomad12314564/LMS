package lms;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Gender gender;

    public Student() {
    }

    public Student(int id, String name, String lastName, String email, String password, Gender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\nid = " + id +
                "\nname = " + name +
                "\nlastName = " + lastName +
                "\nemail = " + email +
                "\npassword = " + password+
                "\ngender = " + gender;
    }
}
