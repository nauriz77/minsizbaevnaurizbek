import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Бірінші сан: ");
        double a = sc.nextDouble();

        System.out.print("Екінші сан: ");
        double b = sc.nextDouble();

        System.out.print("Амал (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Нәтиже: " + (a + b)); break;
            case '-': System.out.println("Нәтиже: " + (a - b)); break;
            case '*': System.out.println("Нәтиже: " + (a * b)); break;
            case '/': System.out.println("Нәтиже: " + (a / b)); break;
            default: System.out.println("Қате амал");
        }
    }
}