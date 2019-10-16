public class HouseTest {
    public static void main(String[] args) {

        House it = new House("It Tralee, Tralee, Kerry","Business",1000,"OwnerOwner",45);

        System.out.println(it.toString());

        Person monopolyMan = new Person("Richy Rich",99);

        House shopping = new House("Manor shopping center","business",500000,monopolyMan);

        System.out.println("\n\n" + shopping.toString());
    }
}
