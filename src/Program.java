import geometry.CircleGenerator;

public class Program {
    public static void main(String[] args) {
        CircleGenerator generator = new CircleGenerator();

        generator.generate(100);
        System.out.println("Колизий = " + generator.calcCountOfCollisions());
        // -------------------------------

        Door door = new Door();
        System.out.println("Дверь открыта? " + door.toggleState());
        System.out.println("Дверь открыта? " + door.toggleState());
        System.out.println("Дверь открыта? " + door.toggleState());
        System.out.println("Дверь открыта? " + door.toggleState());
        System.out.println("Дверь открыта? " + door.toggleState());
    }
}
