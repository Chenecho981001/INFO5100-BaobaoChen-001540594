public class Main {
    public static void main(String[] args) {

        SeattlePoliceDepartment publisher = new SeattlePoliceDepartment("publisher ");

        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");
        Person p4 = new Person("p4");

        p1.subscribe(publisher);
        p2.subscribe(publisher);
        p3.subscribe(publisher);
        p4.subscribe(publisher);

        publisher.NotifyCitizens("please attention");

        p2.unsubscribe(publisher);
        p3.unsubscribe(publisher);

        publisher.NotifyCitizens("please attention again");
    }
}
