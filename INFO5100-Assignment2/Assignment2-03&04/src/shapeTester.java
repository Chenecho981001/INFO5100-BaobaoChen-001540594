import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class shapeTester {
    public static void main(String[] args) {
        //Question 3: Implement given below figure and test the shapeTester class
        Shape s = new Shape("shape");
        Rectangle r = new Rectangle("rectangle",2.0,3.0);
        Circle c = new Circle("circle",4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();


        //Question 4:  Comparators are used to compare two objects.

        Scanner scan = new Scanner(System.in);
        System.out.println("please input the quantity of player");
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            System.out.println("please input the name and the score of the player");
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);}




    }
}
