package geometry;

public class CircleGenerator {
    private Circle[] circles;

    public void generate(int countOfCircles){
        circles = new Circle[countOfCircles];

        double a = 0;
        double b = 10;
        for(int i = 0; i < countOfCircles; i++){
            Point p = new Point(a + (int) (Math.random() * b),a + (int) (Math.random() * b));
            double radius = a + (int) (Math.random() * b);
            circles[i] = new Circle(radius, p);
        }
    }

    public int calcCountOfCollisions(){
        int result = 0;
        for(int i = 0; i < circles.length; i++){
            for(int j = i + 1; j < circles.length; j++){
                if(circles[i].collisionCheck(circles[j])) {
                    result++;
                }
            }
        }
        return result;
    }
}