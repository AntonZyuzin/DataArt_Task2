package figures;

public class Rectangle extends Figure{

    //длина ширина
    public Rectangle(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    double calculateArea() {
        return num1 * num2;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (num1 + num2);
    }
}
