package ReffernceVariable;

public class School {
    private String name;

    public Address getAddress() {
        return address;
    }

    public Address address;
    public School(String name, Address address) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
