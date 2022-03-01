import java.util.ArrayList;

public class SeattlePoliceDepartment{
    String name;
    ArrayList<Person> person = new ArrayList<Person>();

    public SeattlePoliceDepartment(String name) {
        this.name = name;
    }

    public void NotifyCitizens(String notification){
        for (Person p: person){
            System.out.println(p.name   +" get the message from "+ this.name+": "+ notification);
        }
        System.out.println("-----------------------");
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
