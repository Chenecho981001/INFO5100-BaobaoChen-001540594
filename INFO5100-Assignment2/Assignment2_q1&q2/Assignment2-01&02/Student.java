public class Student {
    int rollNumber;
    String name;
    Student student;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student st){
        rollNumber = st.rollNumber;
        name = st.name;
    }

    public int printRoll() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String printName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


