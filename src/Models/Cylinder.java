package Models;

public class Cylinder extends Circle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(int radius, double height) {
        super(radius);
        this.height = height;
    }

    public void calculate_area_Cylinder(){

        double area = this.getHeight() * super.getPi() * super.getRadius();
        System.out.println(area);
    }
}
