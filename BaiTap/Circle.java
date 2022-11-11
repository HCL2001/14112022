package BaiTap;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "green";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArena(){
        return (this.radius * this.radius) * 3.14;
    }

    public double getPerimeter(){
        return (2 * 3.14) * this.radius;
    }

    public String toString(){
        return "A circle has radius: " + this.radius + " and color: " + this.color;
    }
}
