public class Shape {
    String name;
    String color;
    double area;
    double perimeter;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }


    //1)Create getter and setter methods for all classes
    public void getArea(){
    }

    public void getPerimeter(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    //2)Create printShape() method in Shape class that returns desired string output.
    public void printShape(){
        System.out.println("-----INFO-----");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);

    }
}
