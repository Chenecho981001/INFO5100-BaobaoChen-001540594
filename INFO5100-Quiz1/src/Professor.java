public class Professor extends Person {
    public Professor(String name, int age, int ID) {
        super(name, age, ID);
    }

    public void giveQuiz(String name){
        System.out.println(name + " is giving a quiz");
    }
}
