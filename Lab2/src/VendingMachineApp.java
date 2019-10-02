public class VendingMachineApp {
    public static void main(String[] args) {

        VendingMachine v1 = new VendingMachine();

        System.out.println(v1.purchase());

        v1.setCans(5);

        v1.setTokens(5);

        System.out.println(v1.fillUp(10));

        System.out.println(v1.purchase());

        System.out.println(v1.getCans());

        System.out.println(v1.getTokens());
    }
}
