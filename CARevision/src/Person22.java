public class Person22 {

    private String name;
    private double age;

    public Person22(){
        setName("No name specified");
        setAge(0.0);
    }

    public Person22(String name, double age)
    {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public String toString() {
        return "\nOwner Name: " + getName() + "\nOwner Age: " + getAge();
    }
}
