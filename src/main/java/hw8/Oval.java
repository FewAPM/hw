package hw8;

public class Oval extends Shape {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    void printName() {
        System.out.println("Shape name is - " + this.getName());
    }
}

