package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Lets make a circle.\n");
        Circle circle = new Circle(in.getDouble());
        System.out.printf("Circumference = %f ", circle.getCircumference());
        System.out.printf("\nArea = %f ", circle.getArea());
    }
}
