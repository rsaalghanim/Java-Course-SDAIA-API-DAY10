package HW3;

public class Student extends PersonRecord implements ComparableById {
    private int studentId;
    private String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super();
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId < 0 || studentId > 150) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                System.out.println(studentId + " id is invalid");
                //   throw new RuntimeException(e);
            }
            this.studentId = studentId;
        }
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public String getDetail() {
        return "Student{" +
                "studentId=" + studentId +
                ", course='" + course + '\'' +
                '}';
    }

//    public boolean compId(int id){
//        return studentId ==id;
//    }


    @Override
    public boolean compId(int id) {
        return studentId ==id;
    }
}
