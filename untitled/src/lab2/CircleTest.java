package lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "red", false);
        c1.setRadius(12);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
    }
}