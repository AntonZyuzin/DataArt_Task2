package figures;

public abstract class Figure {

    int num1;
    int num2;

    Figure(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
