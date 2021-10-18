package figures;

public class Circle extends Figure {

    //радиус и диаметр
    public Circle(int [] values) {
        super(values);
    }

    @Override
    double calculateArea() {
        return Math.PI * (values[0] * values[0]);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * values [0];
    }
}
