package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.printf("box1 perimeter = %d\n", box1.getPerimeter());
//        System.out.printf("box1 area = %d\n", box1.getArea());
//        System.out.println();
//
//        Square box2 = new Square(5);
//        System.out.printf("box2 perimeter = %d\n", box2.getPerimeter());
//        System.out.printf("box2 area = %d\n", box2.getArea());

        //todo #7
        Measurable myShape;

        Square square1 = new Square(5);
        System.out.printf("\nsquare1 area = %d", square1.getArea());
        System.out.printf("\nsquare1 perimeter = %d", square1.getPerimeter());
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~");
        Rectangle rec1 = new Rectangle(5, 10);
        System.out.printf("rec1 area = %d", rec1.getArea());
        System.out.printf("\nrec1 perimeter = %d", rec1.getPerimeter());

        //todo #9       Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

//        System.out.printf("\nrec1 perimeter = %d", rec1); // not sure..

        //todo #10      What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

        //not sure..

        System.out.println("\n\nGREAT SUCCESS!!");
    }
}
