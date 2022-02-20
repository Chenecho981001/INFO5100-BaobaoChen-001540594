public class Student extends Person{
    public Student(String name, int age, int ID) {
        super(name, age, ID);
    }

    public void takeQuiz(String name){
        System.out.println(name +" is taking a quiz");
    }
}
