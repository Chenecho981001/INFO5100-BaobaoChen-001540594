public class Sad extends Moody{
    public String mood;

    public Sad(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    };

    public void ExpressFeelings(){
        System.out.println("waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    };

    public void queryMood(){
        System.out.println("i feel sad today");
    }
    public String toString(){
        return "Subject cries a lot";
    };

}
