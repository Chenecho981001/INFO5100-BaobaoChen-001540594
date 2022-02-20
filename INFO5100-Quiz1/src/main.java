public class main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Bob",30,01);
        Student  s1 = new Student("ann",21,001);
        Student  s2 = new Student("bnn",20,002);
        Student  s3 = new Student("cnn",22,003);
        Student  s4 = new Student("dnn",23,004);

        p1.giveQuiz("Bob");
        s1.takeQuiz("ann");
        s1.takeQuiz("bnn");
        s1.takeQuiz("cnn");
        s1.takeQuiz("dnn");
        
    }
}
