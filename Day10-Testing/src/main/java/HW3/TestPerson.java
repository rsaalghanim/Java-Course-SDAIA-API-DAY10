package HW3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) throws FileNotFoundException {
        var sc = new Scanner(System.in);
        System.out.println("person 1: ");
        Person p1 = new Person() ;
        p1.setName("rana");
        p1.setAge(30);
        p1.setAddress("300 street");
Person p5 = new Person();
        System.out.println("Name: " + p1.getName() +" , Age: " + p1.getAge() +" , Address: " + p1.getAddress());
        System.out.println();

        System.out.println("person 2: ");
        Person p2 = new Person() ;
        p2.setName("malak");
        p2.setAge(500);
        p2.setAddress("200kl street");
        School school = new School();


       System.out.println("Name: " + p2.getName() +" , Age: " + p2.getAge() +" , Address: " + p2.getAddress());


       // ----------------- Students -------------------------
     Student s1 =new Student("khalid",20,"28883",123,"java");
        Student s2 =new Student("Hala",44,"76758kk",456,"math");
        Student s3 =new Student("nawal",28,"57484;",789,"CA Gen");
        Student s4 =new Student("waleed",17,"3837489 ;",1122,"Database");
       //System.out.println( s1.getDetail());
       // System.out.println( s2.getDetail());
        System.out.println("----------------------------");

      school.addStudent(s1);
      school.addStudent(s2);
      school.addStudent(s3);

        //s1.getStudentId();
        System.out.println("All student:");
        school.displayStudents();
        System.out.println("----------------------------");
        school.removeStudent(s1.getStudentId());
        System.out.println("After removing student with id=123 :");
        school.displayStudents();

        school.addStudent(s4);



        System.out.println("-----------------------------");
        System.out.println("Writing in Student File");
        school.writeIntoFile("student.txt");

        school.displayStudents();

        System.out.println("-----------------------------");
        System.out.println("Reading from Student File");
     school.readFromFile("student.txt");
     school.displayStudents();






//        public static void personDetails(Person p){
//            System.out.println(p.getName());
//            System.out.println(p.getAge());
//            System.out.println(p.getAddress());
//        }

    }
}
