public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height / 2.0;
    }

    public void display() {
        System.out.println("This is a triangle with base " + base + " and height " + height + ".");
    }
}
