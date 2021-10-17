package figures;

public class Calculator {

    public double calculateSumAreas(Figure [] figures) {
        double area = 0;
        for (Figure f : figures) {
            area += f.calculateArea();
        }
        return area;
    }
}
