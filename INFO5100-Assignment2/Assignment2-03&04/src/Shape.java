public class Shape {
    String name;
    double area;
    double perimeter;

    public Shape(String n) {
        this.name = n;
    }

    public Shape(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void display(){
        System.out.println("-----INFO-----");
        System.out.println("Name: "+ name );
    }


}
