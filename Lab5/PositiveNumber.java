import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (num <= 0) {
            System.out.print("Оң сан енгізіңіз: ");
            num = sc.nextInt();
        }

        System.out.println("Рахмет!");
    }
}