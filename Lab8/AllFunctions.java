import java.util.Scanner;

public class AllFunctions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();

        double y;

        //1
        for(double k=0.1;k<=1;k+=0.1){
            y = k*x;
            System.out.println("1) y = kx , k="+k+" -> "+y);
        }

        //2
        y = 3*Math.pow(x,2);
        System.out.println("2) y = 3x^2 = "+y);

        //3
        y = -6*Math.pow(x,2)+3*x;
        System.out.println("3) y = -6x^2+3x = "+y);

        //4
        y = Math.pow(x,3)+2*Math.pow(x,2)+x;
        System.out.println("4) y = x^3+2x^2+x = "+y);

        //5
        y = Math.pow(x,5);
        System.out.println("5) y = x^5 = "+y);

        //6
        y = Math.sin(x);
        System.out.println("6) y = sin(x) = "+y);

        //7
        y = Math.cos(x-1)+Math.abs(x);
        System.out.println("7) y = cos(x-1)+|x| = "+y);

        //8
        if(x!=0){
            y = 1/x;
            System.out.println("8) y = 1/x = "+y);
        }else System.out.println("8) анықталмайды");

        //9
        if(x!=2){
            y = (x+3)/(x-2);
            System.out.println("9) y = (x+3)/(x-2) = "+y);
        }else System.out.println("9) анықталмайды");

        //10
        if(x!=0){
            y = 3 + 2/x + 3/Math.pow(x,2);
            System.out.println("10) y = 3 +2/x +3/x^2 = "+y);
        }

        //11
        if(x!=0){
            y = 3 - 2/x - 3/Math.pow(x,2);
            System.out.println("11) y = 3 -2/x -3/x^2 = "+y);
        }

        //12
        if(3*Math.pow(x,2)+2*x+1!=0){
            y = 1/(3*Math.pow(x,2)+2*x+1);
            System.out.println("12) y = 1/(3x^2+2x+1) = "+y);
        }

        //13
        if(Math.pow(x,2)+2*x+1!=0){
            y = 1/(Math.pow(x,2)+2*x+1);
            System.out.println("13) y = 1/(x^2+2x+1) = "+y);
        }

        //14
        if(Math.pow(x,2)+3*x+1!=0){
            y = 1/(Math.pow(x,2)+3*x+1);
            System.out.println("14) y = 1/(x^2+3x+1) = "+y);
        }

        //15
        if(3*Math.pow(x,2)+2*x+1!=0){
            y = x/(3*Math.pow(x,2)+2*x+1);
            System.out.println("15) y = x/(3x^2+2x+1) = "+y);
        }

        //16
        if(Math.pow(x,2)+2*x+1!=0){
            y = x/(Math.pow(x,2)+2*x+1);
            System.out.println("16) y = x/(x^2+2x+1) = "+y);
        }

        //17
        if(Math.pow(x,2)-2*x+1!=0){
            y = x/(Math.pow(x,2)-2*x+1);
            System.out.println("17) y = x/(x^2-2x+1) = "+y);
        }

        //18
        if(Math.pow(x,2)+3*x+1!=0){
            y = x/(Math.pow(x,2)+3*x+1);
            System.out.println("18) y = x/(x^2+3x+1) = "+y);
        }

        //19
        if(Math.pow(x,2)-3*x+1!=0){
            y = x/(Math.pow(x,2)-3*x+1);
            System.out.println("19) y = x/(x^2-3x+1) = "+y);
        }

        //20
        if(Math.pow(x,2)-5!=0){
            y = 3*x/(Math.pow(x,2)-5);
            System.out.println("20) y = 3x/(x^2-5) = "+y);
        }

    }
}