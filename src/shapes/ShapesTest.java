package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.printf("box1 perimeter = %d\n", box1.getPerimeter());
        System.out.printf("box1 area = %d\n", box1.getArea());
        System.out.println();
        Rectangle box2 = new Square(5);
        System.out.printf("box2 perimeter = %d\n", box2.getPerimeter());
        System.out.printf("box2 area = %d\n", box2.getArea());
    }
}
