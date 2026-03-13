import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Сан оң");
        } else if (num < 0) {
            System.out.println("Сан теріс");
        } else {
            System.out.println("Сан нөлге тең");
        }
    }
}