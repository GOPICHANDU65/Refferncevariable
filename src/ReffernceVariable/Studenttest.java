package ReffernceVariable;

public class Studenttest {


    public Address getAddress(Student ss, Teacher tt, School school) {
        Student s1 = new Student("chandu", 100, new Address("hyd"));
        Teacher t = new Teacher("MATHS", new Address("peddapuram"));
        School sss = new School("nova", new Address("VIJ"));


        if (ss != null) {
            if (ss.getRoolNo() == s1.getRoolNo()) {
                return s1.getAddress();
            } else {
                return null;
            }
        }
      if(tt !=null) {
        if (tt.getSubject() == t.getSubject()) {
            return t.getAddress();

        }else{
        return null;
    }
}
      if(school != null) {
          if (school.getName() == sss.getName()) {
              return sss.getAddress();
          } else {
              return null;
          }
      }
       return null;
    }

      public static void main (String[]args){
            Studenttest test = new Studenttest();
          Student sts = new Student("chandu",100,null);
          Teacher ttt = new Teacher("maths", null);
          School ssss = new School("nova", null);
           System.out.println(test.getAddress(sts,null,null));
        }
}