package Models;

public class Rectangle {
    double length;

    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void Calc_Rect_area(){
        double area = this.length * this.breadth;
        System.out.println(area);
    }
}
