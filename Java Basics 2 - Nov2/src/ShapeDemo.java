public class ShapeDemo {
    public static void main(String args[]){
        Shape square = new Rectangle(5, 5);
        Shape bubble = new Circle(3);
        Shape wedge = new Triangle(2, 10);

        square.display();
        System.out.println("Square area: " + square.calculateArea());
        bubble.display();
        System.out.println("Bubble area: " + bubble.calculateArea());
        wedge.display();
        System.out.println("Wedge area: " + wedge.calculateArea());
    }
}
