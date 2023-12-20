package ReffernceVariable;

   public class Student {
        private String name;
    private int roolNo;

    public Address address;

       public Student(String name, int roolNo, Address address) {
           this.roolNo = roolNo;
           this.name=name;
           this.address=address;
       }

    public String getName() {
        return name;
    }

    public int getRoolNo() {
        return roolNo;
    }

    public Address getAddress() {
        return address;
    }
}
