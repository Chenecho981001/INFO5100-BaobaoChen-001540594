public class Happy extends Moody{

    public String mood;

    public Happy(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    };

    public void ExpressFeelings(){
        System.out.println("heeehee....hahahah...HAHAHA!!");
    };

    public String toString(){
        return "Subject laughs a lot";
    };
    public void queryMood(){
        System.out.println("i feel happy today");
    }

}

