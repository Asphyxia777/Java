package lab2;

public class Circle {
    public double radius;
    public boolean filled;
    public String color;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled;
    }
}
