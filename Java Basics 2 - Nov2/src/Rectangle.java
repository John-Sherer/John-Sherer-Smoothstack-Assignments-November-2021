public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void display() {
        System.out.println("This is a rectangle with width " + width + " and height " + height + ".");
    }
}
