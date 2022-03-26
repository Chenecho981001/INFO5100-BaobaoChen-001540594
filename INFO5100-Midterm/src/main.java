import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        //Q1 Deep copy and what is a shallow copy.
        // the difference between deep copy and shallow copy is that the shallow copy only copy the the value,
        // but deep copy not only copy the value but create a totally new object;
        Student stu1 = new Student(new Student("Ann",3.8,"a1"));
        System.out.println(stu1.getGpa());
        System.out.println(stu1.studentID);
        System.out.println(stu1.getName());
        System.out.println("================");

        //Q2 difference between abstract class and interface.

        Teacher_son  t= new Teacher_son();
        t.teach();
        Professor_son p =new Professor_son();
        p.teach();
        System.out.println("================");


        //Q3
        Psychiatrist psy = new Psychiatrist();
        Happy h = new Happy("happy");
        Sad s = new Sad("sad");
        psy.examine(h);
        h.queryMood();
        h.ExpressFeelings();
        psy.observe(h);

        psy.examine(s);
        s.queryMood();
        s.ExpressFeelings();
        psy.observe(s);
        System.out.println("================");


        //Q4

        System.out.println("================");

        //Q5
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
        System.out.println("================");


        //Q6
        String str = "bbb";
        if (str.length()==0) {
            System.out.println(0);
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < str.length(); i ++){
            if(map.containsKey(str.charAt(i))){
                left = Math.max(left,map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        System.out.println(max);
        System.out.println("================");

    }





    }


