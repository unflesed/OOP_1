package opp_1.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону 1:");
        rectangle.setSide1(sc.nextDouble());
        System.out.println("Введите сторону 2:");
        rectangle.setSide2(sc.nextDouble());
        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator(rectangle.getSide1(),
                rectangle.getSide2()));
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(rectangle.getSide1(),
                rectangle.getSide2()));
    }
}
