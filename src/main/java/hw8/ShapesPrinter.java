package hw8;

public class ShapesPrinter {

    static public void printName(Shape shape) {
        shape.printName();
    }

    public static void main(String[] args) {

        Shape oval = new Oval();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape quad = new Quad();

        ShapesPrinter.printName(oval);
        ShapesPrinter.printName(rectangle);
        ShapesPrinter.printName(triangle);
        ShapesPrinter.printName(circle);
        ShapesPrinter.printName(quad);


    }

}
