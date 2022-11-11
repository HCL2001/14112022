package BaiTap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder b = new Cylinder();
        Cylinder c = new Cylinder(2, "red", 3);
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
