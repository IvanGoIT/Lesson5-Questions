import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public int readInt(String message) {
        System.out.println(message);
        try {
            // считывание с консоли
            return scanner.nextInt();
        } catch (Exception e) {
            // обработка ошибки
            scanner.nextLine();
            System.out.println("Введен не int");
            return readInt(message);
        }
    }
}
