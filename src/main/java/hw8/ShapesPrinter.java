package hw8;

public class ShapesPrinter {

    static public void printName(Shape shape) {
        shape.printName();
    }

    public static void main(String[] args) {
    Shape oval = new Oval();
    oval.setName("Oval");
    ShapesPrinter.printName(oval);

    Shape circle = new Circle();
    circle.setName("Circle");
    ShapesPrinter.printName(circle);




    }

}
