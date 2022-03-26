import org.w3c.dom.ls.LSOutput;

public abstract class Moody {
    public String name;

    public abstract String getMood();

    public abstract void ExpressFeelings();

    public void queryMood(){
        System.out.println("i feel " +name + "today");
    }


}
