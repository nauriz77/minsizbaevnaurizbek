import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Сан 3-ке және 5-ке бөлінеді");
        } else {
            System.out.println("Сан 3 және 5-ке бірдей бөлінбейді");
        }
    }
}