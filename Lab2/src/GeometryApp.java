public class GeometryApp {
    public static void main(String[] args) {
        Geometry myPoint;

        myPoint = new Geometry(2.0,3.0);

        System.out.println(myPoint.toString());

        myPoint.moveHorizontally(4);
        System.out.println(myPoint.toString());

        myPoint.moveVertically(3.0);
        System.out.println(myPoint.toString());

        myPoint.translate(2.0,2.0);
        System.out.println(myPoint.toString());

        System.out.println(String.format("%.2f",myPoint.distanceFromOrigin()));

    }
}
