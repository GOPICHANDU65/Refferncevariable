package ReffernceVariable;

public class Teacher {
    private String Subject;

    public Address getAddress() {
        return address;
    }

    public Address address;
    public Teacher(String subject,Address address) {
       this.Subject = subject;
       this.address=address;

    }

    public String getSubject() {
        return Subject;
    }
}
