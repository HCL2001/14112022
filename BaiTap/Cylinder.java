package BaiTap;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        this.height = 1;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getV(){
        return 1/2 * getRadius() * this.height;
    }

    public String toString(){
        return "A Cylinder has radius " + getRadius() + " and height " + this.height + " and color " + getColor();
    }
}
