import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("N = "); N = scanner.nextInt();

        int counter = 1;

        while(counter <= N){
            if(counter % 5 == 0 && counter % 3 != 0){
                System.out.println(counter);
            }

            counter++;
        }
    }
}
