package in.person.Info;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person = new Person("Gyan",21,"001");
        Person person1 = new Person("Gyan",21,"001");

        if(person.equals(person1))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
    }
}
