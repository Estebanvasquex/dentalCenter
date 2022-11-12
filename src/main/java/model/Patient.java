package model;

public class Patient {

    private Integer id;
    private String firstName;
    private String LastName;
    private String email;
    private String password;
    private String DNI;
    private String domicile;
    private String current_Date;

    public Patient() {
    }

    public Patient(Integer id, String firstName, String lastName, String email, String password, String DNI, String domicile, String current_Date) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.password = password;
        this.DNI = DNI;
        this.domicile = domicile;
        this.current_Date = current_Date;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getCurrent_Date() {
        return current_Date;
    }

    public void setCurrent_Date(String current_Date) {
        this.current_Date = current_Date;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", DNI='" + DNI + '\'' +
                ", domicile='" + domicile + '\'' +
                ", current_Date='" + current_Date + '\'' +
                '}';
    }
}
