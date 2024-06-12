package HW3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class School {//

    private List <Student> students;

    public School(){
        students = new ArrayList<>();

    }

    public  void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent (int studentId){

        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getStudentId() == studentId){
                iterator.remove();
                break;
            }
        }
    }

//    public void sortStudent(){
//        Collections.sort(students);
//    }


//    public Student findStudent (int studentId) {
//        int low = 0;
//        int high = students.size() - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            Student student = students.get(mid);
//            if (student.getStudentId() == studentId) {
//                return student;
//            } else if (student.getStudentId() < studentId) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//
//        }
//    }


    public void displayStudents (){
        for (Student student : students){
            System.out.println(student.getDetail());
            System.out.println();
        }
    }

    public void writeIntoFile (String filename){
       filename = "student.txt";
    try(PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        for (Student student : students){
            writer.println(student.getDetail());
        }
        System.out.println("write to file student : "+ filename);
    }catch (IOException e){
        System.out.println( "can't write on the file " + e.getMessage());
    }
    }

    public void readFromFile (String filename) throws FileNotFoundException {
        filename = "student.txt";
        var fsc = new Scanner(filename);
        while (fsc.hasNext()) {
            System.out.println(fsc.nextLine());
        }

        fsc.close();
    }
}
