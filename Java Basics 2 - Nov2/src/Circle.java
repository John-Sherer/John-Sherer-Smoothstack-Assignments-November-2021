public class Circle implements Shape{
    private double radius;

    public Circle(float radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public void display() {
        System.out.println("This is a circle with radius " + radius + ".");
    }
}
