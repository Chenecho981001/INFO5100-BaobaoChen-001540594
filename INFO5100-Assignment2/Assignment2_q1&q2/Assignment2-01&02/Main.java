public class Main {
    public static void main(String[] args) {
        //Question1: Implement given program using copy constructor by
        // creating a class Student with two parameter
        Student student1 = new Student(101, "ABC");

        System.out.println(" Roll number of the first student: "+ student1.printRoll());

        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);

        System.out.println(" Roll number of the second student: "+     student2.printRoll());

        System.out.println(" Name of the second student: "+ student2.printName());


        //Question 2:  Create a Shape class and a sub classes triangle, rhombus
        Shape s = new Shape("s1","yellow");
        s.printShape();
        Triangle t1 = new Triangle("t1","red",10,20);
        t1.printShape();
        t1.getArea(10,20);  //200
        t1.getPerimeter(10,20); // 60

        Triangle t2 = new Triangle("t2","blue",10);
        t2.printShape();
        t2.getArea(10); //100
        t2.getPerimeter(10); //40

        Rhombus r1 = new Rhombus("r1","red",10,20);
        r1.printShape();
        r1.getArea(10,20); //100
        r1.getPerimeter(10,20);

        Rhombus r2 = new Rhombus("r2","blue",20); //200
        r2.printShape();
        r2.getArea(20);
        r2.getPerimeter(20);

    }

}
