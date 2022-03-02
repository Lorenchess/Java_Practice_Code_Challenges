package Shapes;

public class Square extends Shape{

    public Square(int width) {
        super();
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(width * width);
    }
}
