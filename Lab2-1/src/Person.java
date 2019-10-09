public class Person {
    private String name;

    public Person()
    {
        this.Person(name);
    }

    public void Person(String name)
    {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return("Name of Person: " + getName());
    }
}
