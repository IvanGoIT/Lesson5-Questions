import java.util.Scanner;

public class SwitchAndRecursion {

    public static int startRecursion0() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return recursion0(x);
    }

    public static int recursion0(int x) {
        if (x == 0) return 1;
        return recursion0(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch(number) {
            case 0:
                startRecursion0();
                break;
        }
    }
}
