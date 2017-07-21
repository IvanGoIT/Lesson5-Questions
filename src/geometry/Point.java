package geometry;

public class Point {
    private double x, y;

    public Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcLength(Point otherPoint){
        return Math.sqrt((Math.pow(getX() - otherPoint.getX(), 2)) + (Math.pow(getY() - otherPoint.getY(), 2)));
    }
}
