public class House {
    private String address,type;
    private int price;
    private Person owner;

    public House(){
        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0);
        setOwner("No Owner Specified",0);
    }

    public House(String address, String type, int price, Person owner){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }

    public House(String address, String type, int price, String name, int age){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(name,age);

    }






    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void setOwner(String name, int age) {
        owner = new Person(name, age);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String toString() {
        return"Address: " + address+ "\nType of House: " + type + "\nPrice: $" + price+ "\nOwner name: " + getOwner().getName() + "\nOwner age: " + owner.getAge();
    }
}
