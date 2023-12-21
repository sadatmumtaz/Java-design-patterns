package Assignment2.FluentInterfacePattern;



public abstract class IPersonBuilder {
    protected Person person;

    public IPersonBuilder() {
        this.person = new Person();
    }

    public abstract PersonBuilder withName(String name);

    public abstract PersonBuilder withAge(int age);

    public abstract Person build();
}
