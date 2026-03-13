import java.util.Scanner;

public class PieceFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();

        double y;

        if (x < 0) {
            y = x * x;
        } else if (x == 0) {
            y = 0;
        } else {
            y = Math.sqrt(x);
        }

        System.out.println("y = " + y);
    }
}