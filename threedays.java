import java.util.Scanner;

public class threedays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int x, y;

            System.out.print("1-son: "); x = scanner.nextInt();
            System.out.print("2-son: "); y = scanner.nextInt();

            System.out.println(x + y);
            System.out.println(x - y);
            System.out.println(x * y);
            System.out.println(x / y);
            System.out.println(x % y);
    }
}
