package Shapes;

public class Circle extends Shape{
    public Circle(int width) {
        super();
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}
