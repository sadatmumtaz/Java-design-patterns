package Assignment2.FluentInterfacePattern;



public class PersonBuilder extends IPersonBuilder {
    @Override
    public PersonBuilder withName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }

}
