import geometry.CircleGenerator;

public class Program {
    public static void main(String[] args) {
        CircleGenerator generator = new CircleGenerator();

        generator.generate(100);
        System.out.println("Колизий = " + generator.calcCountOfCollisions());
    }
}
