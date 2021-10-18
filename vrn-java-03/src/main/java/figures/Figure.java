package figures;

public abstract class Figure {

    int [] values;

    Figure(int [] values) {
        this.values = values;
    }

    double calculateArea() {
        return values[0] * values[1];
    }

    double calculatePerimeter() {
        return values[0] * values[1];
    }
}
