package Task_06;

public class TestCircle {
    public static void main(String [] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.0);
        System.out.println("radius is: " + c1.getRadius());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has the radius of "  + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3.0,"Yellow");
        System.out.println("The circle has the radius of " + c3.getRadius() + " and area of " + c3.getArea());

        Circle c4 = new Circle(4.0,"Blue");
        System.out.println(c4.toString());
    }
}
