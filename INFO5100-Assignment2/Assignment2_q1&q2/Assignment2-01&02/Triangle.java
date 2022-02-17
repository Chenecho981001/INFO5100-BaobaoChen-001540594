public class Triangle extends Shape {
    double base;
    double height;
    double side;
    String name;
    String color;


    public Triangle(String n, String c, double b, double h){
        super(n,c);
        this.base = b;
        this.height = h;
    }


    //1)Create getter and setter methods for all classes.
    public Triangle(String name, String color, double s){
        super(name, color);
        this.side =s;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    //3)Override the getArea() and getPerimeter() getter methods
    // of Shape in triangle and rhombus to give desired output.
    public void getArea(double base,double height){
        double area = base * height;
        System.out.println( "the area of  the  triangle is " + area  );
    }

    public void getArea(double side){
        double area = side*side;
        System.out.println( "the area of  the  triangle is " + area  );
    }


    public void getPerimeter(double base,double height){
        double perimeter = base *2 + height*2;
        System.out.println( "the perimeter of  the  triangle  is " + perimeter  );
    }

    public void  getPerimeter(double side){
        double  perimeter = side * 4;
        System.out.println("the perimeter of  the  triangle  is " + perimeter);
    }

}
