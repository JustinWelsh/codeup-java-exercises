package shapes;
//todo #6
public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int length) {

    }
    @Override
    public void setWidth(int width) {

    }

    @Override
    public int getPerimeter() {
        return length * 4;
    }

    @Override
    public int getArea() {
        return length * length;
    }
}

