public class Person {
    String name;
    Integer age;

    public Person(String name) {
        this.name = name;
    }

    public void subscribe(SeattlePoliceDepartment spd){
        spd.getPerson().add(this);
    }

    public void unsubscribe(SeattlePoliceDepartment spd){
        spd.getPerson().remove(this);
    }

    public void getNotification(SeattlePoliceDepartment spd){

    }

}
