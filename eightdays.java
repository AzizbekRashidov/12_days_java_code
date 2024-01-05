import java.util.Scanner;

public class eightdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("N = ");N = scanner.nextInt();

        int num, sum = 0;
        for(int i = 1; i <= N; i++){
            System.out.print(i + "-son: ");num = scanner.nextInt();
            sum = sum + num;
        }

        System.out.println("Yig'indi: " + sum);
        System.out.println("O'rtacha " + sum / N);
    }
}
