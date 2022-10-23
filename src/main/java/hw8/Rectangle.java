package hw8;

public class Rectangle extends Shape implements Areable{
    String name;
    private int [] coordinates = new int [4];

public Rectangle(String name, int x1, int y1, int x2, int y2){
    this.name = name;
       coordinates[0] = x1;
       coordinates[1] = y1;
       coordinates[2] = x2;
       coordinates[3] = y2;
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
    public int [] getCoordinates() {
     return coordinates;
    }

    @Override
    public int getArea() {
        return ((Math.abs(coordinates[2] - coordinates[0])) * (Math.abs(coordinates[3] - coordinates[1])));
    }



}
