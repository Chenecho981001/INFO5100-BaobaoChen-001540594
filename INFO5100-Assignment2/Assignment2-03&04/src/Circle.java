import javax.naming.RefAddr;

public class Circle extends Shape {
    double radius;
    String name;


    public Circle(String n,double radius) {
        super(n);
        this.radius = radius;
    }

    public void computeArea(){
        System.out.println("-----AREA------");
        System.out.println("the area of this circle is  " + Math.PI * Math.pow(radius,2) );
    }

    public void computePerimeter(){
        System.out.println("-----PERI------");
        System.out.println("the perimeter of this circle is " +2 * Math.PI * radius);
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Area: "+ Math.PI * Math.pow(radius,2));
        System.out.println("perimeter: " + 2 * Math.PI * radius);
    }

}
