package hw8;

public class ShapesPrinter {

    static public void printName(Shape shape) {

        shape.printName();
    }

    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Rectangle", 2,2,12,12);
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        ShapesPrinter.printName(rectangle);


    }

}
