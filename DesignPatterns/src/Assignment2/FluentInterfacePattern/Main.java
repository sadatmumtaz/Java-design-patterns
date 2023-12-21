package Assignment2.FluentInterfacePattern;


public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().withName("Sadat").withAge(10).build();
        System.out.println(person.getAge());
    }
}
