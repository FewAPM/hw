package hw8;

public class Circle extends Shape{
   private String name;
   double radius;

   public Circle(String name, double radius){
       this.name = name;
       this.radius = radius;
   }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    void printName() {
        System.out.println("Shape name is - " + this.getName());
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

