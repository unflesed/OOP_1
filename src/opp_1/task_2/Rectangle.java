package opp_1.task_2;

public class Rectangle {
    double side1;
    double side2;
    double areaCalculator (double side1, double side2){
        return side1 * side2;
    }
    double perimeterCalculator (double side1, double side2){
        return 2 * (side1 + side2);
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
