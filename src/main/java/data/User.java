package data;

public class User {
    String firstname;
    String lastname;
    String email;
    boolean male;
    String mobile;
    String subject;
    String address;


    public User(String firstname, String lastname, String email, boolean male, String mobile, String subject, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.male = male;
        this.mobile = mobile;
        this.subject = subject;
        this.address = address;
    }

    public User() {
        this.firstname = "Nazar";
        this.lastname = "Nerubayko";
        this.email = "nazarka614@gmail.com";
        this.male = true;
        this.mobile = "0968795857";
        this.subject = "E";
        this.address = "Odessa";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return male;
    }

    public String getMobile() {
        return mobile;
    }


    public String getSubject() {
        return subject;
    }

    public String getAddress() {
        return address;
    }

}
