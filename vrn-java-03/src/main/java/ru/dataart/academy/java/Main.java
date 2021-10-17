package ru.dataart.academy.java;

import figures.Calculator;
import figures.Circle;
import figures.Figure;
import figures.Rectangle;

public class Main{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Figure[] figures = {
                new Circle(2, 4),
                new Rectangle(3, 4)
        };

        System.out.println("Сумма площадей: " + calculator.calculateSumAreas(figures));
        System.out.print("Task for Java OOP");
    }
}