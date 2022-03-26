public class Student {
    String name;
    Double gpa;
    String studentID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Student(String name, Double gpa, String studentID) {
        this.name = name;
        this.gpa = gpa;
        this.studentID = studentID;
    }

    public Student(Student stu) {
        this.studentID = stu.studentID;
        this.gpa = stu.getGpa();
        this.name = stu.name;
    }


}
