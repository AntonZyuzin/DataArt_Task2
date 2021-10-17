package figures;

public class Circle extends Figure {

    //радиус и диаметр
    public Circle(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    double calculateArea() {
        return Math.PI * (num1 * num1);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * num2;
    }
}
