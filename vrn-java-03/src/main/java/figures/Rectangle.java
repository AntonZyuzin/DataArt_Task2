package figures;

public class Rectangle extends Figure{

    //длина ширина
    public Rectangle(int [] values) {
        super(values);
    }

    @Override
    double calculateArea() {
        return values[0] * values[1];
    }

    @Override
    double calculatePerimeter() {
        return 2 * (values[0] + values[1]);
    }
}
