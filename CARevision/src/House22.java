public class House22 {

    private String address,type;
    private double price;
    private Person22 owner;

    public House22(){
        setAddress("No address specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner("No Name Specified",0);
    }

    public House22(String address, String type, double price, String name, int age)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(name,age);
    }

    public String getAddress() {
        return address;
    }

    public String getType(){
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Person22 getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if(price>=0)
            this.price = price;
    }

    public void setOwner(String name, int age) {
        owner = new Person22(name,age);
    }

    public String toString() {
        return "Address: " + getAddress() + "\nType: " + getType() + "\nPrice: " + getPrice() + owner.toString();
    }
}
