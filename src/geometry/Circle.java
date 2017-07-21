package geometry;

public class Circle {
    private double radius;
    private Point point;

    public Circle(double radius, Point p){
        this.radius = radius;
        this.point = p;
    }

    public double getRadius() {
        return radius;
    }

    public Point getPoint() {
        return point;
    }

    public boolean collisionCheck(Circle otherCircle){
        if(getRadius() + otherCircle.getRadius() <= point.calcLength(otherCircle.getPoint())){
            return  true;
        } else return false;
    }
}
