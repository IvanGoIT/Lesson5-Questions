import geometry.Circle;

public class TryCatch {
    public static void main(String[] args) {
        Circle circle = null;

        try {
            circle.getRadius();
        } catch(Exception e) {
            //
            e.printStackTrace();
        }

        System.out.println("программа работает дальше");
    }
}
