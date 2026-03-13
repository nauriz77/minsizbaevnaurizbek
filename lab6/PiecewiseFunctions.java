import java.util.Scanner;

public class PiecewiseFunctions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        // 1
        if (x > -2 && x < 5)
            f = 5*Math.pow(x,2)+6;
        else
            f = Math.pow(x,3)+7;
        System.out.println("1) f(x) = " + f);

        // 2
        if (x >= 0)
            f = Math.sqrt(Math.pow(x,3)+5);
        else if (x>-3 && x<0)
            f = 3*Math.pow(x,4)+9;
        else
            f = Double.NaN;
        System.out.println("2) f(x) = " + f);

        // 3
        if (x>-4 && x<=5)
            f = Math.cbrt(Math.pow(x,2)+3+6*Math.pow(x,2));
        else
            f = Math.pow(x,5)+3.5;
        System.out.println("3) f(x) = " + f);

        // 4
        if (x<1.22)
            f = x*Math.cos(x);
        else
            f = 5*Math.pow(x,3)+1.7;
        System.out.println("4) f(x) = " + f);

        // 5
        if (x>0 && x<2)
            f = Math.pow(x,3)*Math.cos(x);
        else if (x>=2)
            f = 3*Math.pow(x,4)+7;
        else
            f = Math.sqrt(5*Math.pow(x,2)+1.6);
        System.out.println("5) f(x) = " + f);

        // 6
        if (x<1.5)
            f = x*Math.tan(x)-Math.sin(x);
        else if (x>=1.5 && x<2.5)
            f = Math.pow(x,3)+Math.sin(x);
        else
            f = 3*Math.pow(x,3)+5;
        System.out.println("6) f(x) = " + f);

        // 7
        if (x>0 && x<1)
            f = Math.sqrt(Math.pow(3,3)+4+Math.cos(x));
        else
            f = 5-Math.pow(Math.sin(x),2)*9;
        System.out.println("7) f(x) = " + f);

        // 8
        if (x>-5 && x<0)
            f = Math.sqrt(Math.pow(x,2)+Math.abs(x));
        else
            f = 5*Math.pow(x,3)+Math.cos(x);
        System.out.println("8) f(x) = " + f);

        // 9
        if (x>=0 && x<1)
            f = x*Math.pow(Math.cos(x),2)+Math.sin(x);
        else if (x>=1 && x<=2)
            f = Math.cbrt(Math.pow(x,2)+6*Math.sin(x));
        else
            f = 1.7*Math.pow(x,3)+7;
        System.out.println("9) f(x) = " + f);

        // 10
        if (x>0)
            f = Math.pow(x,2)*Math.sin(x)+Math.sqrt(Math.pow(x,2)+1.2);
        else if (x>2 && x<=6)
            f = Math.pow(Math.tan(x),2)+Math.cos(x)+3.5;
        else
            f = Double.NaN;
        System.out.println("10) f(x) = " + f);

        // 11
        if (x>0 && x<=4)
            f = Math.sin(Math.PI*x)+Math.pow(x*x+6,1.0/5);
        else
            f = Math.log(x)+Math.sqrt(3*x+7);
        System.out.println("11) f(x) = " + f);

        // 12
        if (x>0 && x<=2)
            f = Math.cbrt(1.7*x+Math.sin(x));
        else
            f = Math.cos(Math.PI*x)+Math.tan(x);
        System.out.println("12) f(x) = " + f);

        // 13
        if (x>1 && x<=3)
            f = Math.sin(5*x)*(Math.sqrt(1+x*x)+Math.pow(Math.log(x),2));
        else
            f = Math.exp(x)*Math.cbrt(x+Math.exp(2*x));
        System.out.println("13) f(x) = " + f);

        // 14
        if (x>-1 && x<=1)
            f = Math.cbrt(Math.abs(x)+Math.pow(x,4));
        else
            f = Math.pow(Math.tan(3*x),2)+Math.log(5*x);
        System.out.println("14) f(x) = " + f);

        // 15
        if (x>1 && x<=3)
            f = Math.pow(x*x*x+Math.sin(Math.PI*x)+Math.log(x),0.25);
        else
            f = Math.cbrt(1.5*Math.pow(x,2)-Math.exp(2*x)+Math.pow(Math.log(x),3));
        System.out.println("15) f(x) = " + f);

    }
}