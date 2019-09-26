package Page40;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() { }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
//        System.out.println(circle.getCircumference());
        System.out.println(circle.getCircumference());
    }
}
