package HW7;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle");
        Quad quad = new Quad("Quad");
        Rectangle rectangle = new Rectangle("Rectangle");
        Circle circle = new Circle("Circle");
        Rhombus rhombus = new Rhombus("Rhombus");



        System.out.println(triangle.printName());
        System.out.println(quad.printName());
        System.out.println(rectangle.printName());
        System.out.println(circle.printName());
        System.out.println(rhombus.printName());
    }
}
