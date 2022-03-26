public class Psychiatrist {
    public Psychiatrist() {
    }

    public void examine(Moody  moody){
        System.out.println("How are you feeling today?");
    }

    public void observe(Moody  moody){
        System.out.println("Observation: "+moody.toString());
    }

    public String toString(){
        return null;
    }

}
