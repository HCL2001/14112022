package BaiTap01;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float arr[] = {this.x, this.y};
        return arr;
    }

    public String toString(){
        return "A point2D have 2 two points x: " + this.x + " and y: " + this.y;
    }
}
