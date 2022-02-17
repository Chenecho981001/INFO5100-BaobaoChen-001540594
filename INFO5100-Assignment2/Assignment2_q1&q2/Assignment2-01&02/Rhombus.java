public class Rhombus extends Shape {
    double diagonal1;
    double diagonal2;
    String name;
    String color;

    public Rhombus(String n, String c,double d1, double d2) {
        super(n, c);
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Rhombus(String n, String c,double d1){
        super(n, c);
        this.diagonal1 = d1;
        this.diagonal2 = d1;
    }


    //1)Create getter and setter methods for all classes.
    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }


    //3)Override the getArea() and getPerimeter() getter methods of Shape
    // in triangle and rhombus to give desired output.
    public void getArea(double d1,double d2){
        double area = d1*d2 / 2;
        System.out.println( "the area of  the rhombus is " + area  );
    }

    public void getArea(double d1){
        double area = d1*d1 / 2;
        System.out.println( "the area of  the rhombus is " + area  );
    }

    public void getPerimeter(double d1,double d2){
        double perimeter = 4 *Math.sqrt((Math.pow(d1/2,2) + Math.pow(d2/2,2) ));
        System.out.println( "the perimeter of  the rhombus is " + perimeter  );
    }

    public void  getPerimeter(double d1){
        double perimeter = 4 *Math.sqrt(Math.pow(d1/2,2) * 2);
        System.out.println( "the perimeter of  the rhombus is "  + perimeter);
    }

}
