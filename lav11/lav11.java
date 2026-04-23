11:
        1.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        System.out.print("y мәнін енгізіңіз: ");
        double y = sc.nextDouble();
        double result = Math.pow(x, y);
        System.out.println("Нәтиже: " + result);
    }
}
2.
        import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        double x = sc.nextDouble();
        if (x < 0) {
            System.out.println("Теріс санның түбірі болмайды!");
        } else {
            System.out.println("Нәтиже: " + Math.sqrt(x));
        }
    }
}
3.
        import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Қосу: " + (a + b));
        System.out.println("Азайту: " + (a - b));
        System.out.println("Көбейту: " + (a * b));
        if (b != 0) {
            System.out.println("Бөлу: " + (a / b));
        } else {
            System.out.println("0-ге бөлуге болмайды");
        }
    }
}
4.
        import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Сан енгізіңіз: ");
            int num = sc.nextInt();
            System.out.println("Сан: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізіңіз!");
        }
    }
}
5.
        import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 – қосу");
        System.out.println("2 – азайту");
        System.out.println("3 – көбейту");
        System.out.println("4 – бөлу");
        int choice = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("0-ге бөлуге болмайды");
                break;
            default: System.out.println("Қате таңдау");
        }
    }
}
6.
        import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();
        history.add("2 + 3 = 5");
        history.add("5 * 2 = 10");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
7.
public class task7 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Экран тазаланды!");
    }
}
8.
        import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = (a * b) / 100;
        System.out.println("Нәтиже: " + result);
    }
}
9.
        import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        System.out.println("sin: " + Math.sin(angle));
        System.out.println("cos: " + Math.cos(angle));
        System.out.println("tan: " + Math.tan(angle));
    }
}
10.
        import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Өрнек енгізіңіз (мысалы: 2 + 3): ");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b != 0) System.out.println(a / b);
                else System.out.println("0-ге бөлуге болмайды");
                break;
            default: System.out.println("Қате оператор");
        }
    }
}