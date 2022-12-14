package model;

public class Dentist {

    private Integer id;
    private String firstName;
    private String LastName;
    private String email;
    private String password;
    private String registration;

    public Dentist() {
    }

    public Dentist(Integer id, String firstName, String lastName, String email, String password, String registration) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.password = password;
        this.registration = registration;
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
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
