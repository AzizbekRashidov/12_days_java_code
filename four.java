import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yosh;

        System.out.println("Yoshingizni kiriting:");

        yosh = scanner.nextInt();

        if(yosh > 0){
            if(yosh >= 12){
                System.out.println("Xush kelibsiz!");
            }
            else{
                System.out.println("Yoshingiz juda kichkina!");
            }
        }
        else{
            System.out.println("Xato ma'lumot kiritilgan!");
        }   
    }
}
