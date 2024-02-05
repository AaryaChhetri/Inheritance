package Models;

public class Cuboid extends Rectangle{
    double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void Calc_Cuboid_area(){
        double area = 2*(this.getLength() * this.getHeight() + this.getLength() * this.getBreadth() + this.getBreadth() * this.getHeight());
        System.out.println(area);
    }
}
