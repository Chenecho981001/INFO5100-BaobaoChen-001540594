public class Rectangle extends Shape {
    String name;
    double length;
    double width;

    public Rectangle(String n, double length, double width) {
        super(n);
        this.length = length;
        this.width = width;
    }

    public void computeArea(){
        System.out.println("-----AREA------");
        System.out.println("the area of this rectangle is " + length * width);
    }

    public void computePerimeter(){
        System.out.println("-----PERI------");
        System.out.println("the perimeter of this rectangle is " +(length * 2+ width * 2));

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area: "+ length * width);
        System.out.println("perimeter: " + (length * 2+ width * 2));
    }
}
