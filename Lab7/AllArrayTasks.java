import java.util.*;

public class AllArrayTasks {

    public static void main(String[] args) {

        Random rand = new Random();

        // 1. A[20] теріс элементтер қосындысы
        int[] A1 = new int[20];
        int sumNeg = 0;
        for(int i=0;i<20;i++){
            A1[i] = rand.nextInt(50)-25;
            if(A1[i] < 0) sumNeg += A1[i];
        }
        System.out.println("1) Теріс элементтер қосындысы = " + sumNeg);


        // 2. B[15] оң элементтер қосындысы
        int[] B1 = new int[15];
        int sumPos = 0;
        for(int i=0;i<15;i++){
            B1[i] = rand.nextInt(50)-25;
            if(B1[i] > 0) sumPos += B1[i];
        }
        System.out.println("2) Оң элементтер қосындысы = " + sumPos);


        // 3. A[12] теріс элементтер көбейтіндісі
        double[] A2 = new double[12];
        double prodNeg = 1;
        for(int i=0;i<12;i++){
            A2[i] = rand.nextDouble()*20-10;
            if(A2[i] < 0) prodNeg *= A2[i];
        }
        System.out.println("3) Теріс элементтер көбейтіндісі = " + prodNeg);


        // 4. C[25] оң элементтер көбейтіндісі
        double[] C1 = new double[25];
        double prodPos = 1;
        for(int i=0;i<25;i++){
            C1[i] = rand.nextDouble()*20-10;
            if(C1[i] > 0) prodPos *= C1[i];
        }
        System.out.println("4) Оң элементтер көбейтіндісі = " + prodPos);


        // 5. D[17] арифметикалық орта
        double[] D1 = new double[17];
        double sum = 0;
        for(int i=0;i<17;i++){
            D1[i] = rand.nextDouble()*20;
            sum += D1[i];
        }
        System.out.println("5) Орташа мән = " + sum/17);


        // 6. A[10][10] қатар бойынша теріс элементтер қосындысы
        int[][] A3 = new int[10][10];
        int[] B2 = new int[10];

        for(int i=0;i<10;i++){
            int s=0;
            for(int j=0;j<10;j++){
                A3[i][j] = rand.nextInt(20)-10;
                if(A3[i][j] < 0) s += A3[i][j];
            }
            B2[i] = s;
        }
        System.out.println("6) B массиві: " + Arrays.toString(B2));


        // 7. B[5][5] қатар бойынша оң элементтер қосындысы
        double[][] B3 = new double[5][5];
        double[] A4 = new double[5];

        for(int i=0;i<5;i++){
            double s=0;
            for(int j=0;j<5;j++){
                B3[i][j] = rand.nextDouble()*20-10;
                if(B3[i][j] > 0) s += B3[i][j];
            }
            A4[i] = s;
        }
        System.out.println("7) A массиві: " + Arrays.toString(A4));


        // 8. A[12][6] баған бойынша теріс элементтер көбейтіндісі
        double[][] A5 = new double[12][6];
        double[] colProd = new double[6];
        Arrays.fill(colProd,1);

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){
                A5[i][j] = rand.nextDouble()*20-10;
                if(A5[i][j] < 0) colProd[j] *= A5[i][j];
            }
        }
        System.out.println("8) Баған көбейтіндісі: " + Arrays.toString(colProd));


        // 9. C[5][5] негізгі диагональ оң элементтер көбейтіндісі
        int[][] C2 = new int[5][5];
        int diagProd = 1;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                C2[i][j] = rand.nextInt(20)-10;
                if(i==j && C2[i][j] > 0) diagProd *= C2[i][j];
            }
        }
        System.out.println("9) Диагональ көбейтіндісі = " + diagProd);


        // 10. D[7][7] диагональ орташа мән
        double[][] D2 = new double[7][7];
        double diagSum = 0;

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                D2[i][j] = rand.nextDouble()*20;
                if(i==j) diagSum += D2[i][j];
            }
        }
        System.out.println("10) Диагональ орташа = " + diagSum/7);


        // 11. max және min ауыстыру
        int[] A6 = new int[25];
        for(int i=0;i<25;i++) A6[i] = rand.nextInt(100);

        int maxI=0,minI=0;

        for(int i=1;i<25;i++){
            if(A6[i] > A6[maxI]) maxI=i;
            if(A6[i] < A6[minI]) minI=i;
        }

        int temp = A6[maxI];
        A6[maxI] = A6[minI];
        A6[minI] = temp;

        System.out.println("11) Ауыстырылған массив: " + Arrays.toString(A6));


        // 12. сұрыптау
        int[] B4 = new int[25];
        for(int i=0;i<25;i++) B4[i] = rand.nextInt(100);
        Arrays.sort(B4);

        System.out.println("12) Сұрыпталған массив: " + Arrays.toString(B4));


        // 13. орташа мән
        int[] C3 = new int[20];
        int sum13=0;
        for(int i=0;i<20;i++){
            C3[i] = rand.nextInt(50);
            sum13 += C3[i];
        }
        System.out.println("13) Орташа = " + (double)sum13/20);


        // 14. жұп және тақ қосынды
        int[] D3 = new int[30];
        int even=0, odd=0;

        for(int i=0;i<30;i++){
            D3[i] = rand.nextInt(50);
            if(D3[i] % 2 == 0) even += D3[i];
            else odd += D3[i];
        }

        System.out.println("14) Жұп қосынды = "+even);
        System.out.println("14) Тақ қосынды = "+odd);


        // 15. 3x5 кездейсоқ кесте
        int[][] table = new int[3][5];

        System.out.println("15) Кесте:");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                table[i][j] = rand.nextInt(10);
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }


        // 16. maxX әдісі
        System.out.println("16) Кестедегі max = " + maxX(table));


        // 17. жолдарды тексеру
        String s1="Hello ";
        String s2="World";
        String s3="Java";
        String s4="Test";
        String s5="Test";

        if(s4.equals(s5)){
            System.out.println("17) " + s1 + s2);
        }else{
            System.out.println("17) " + s1 + s3);
        }

    }

    // max элемент табу әдісі
    static int maxX(int[][] arr){
        int max = arr[0][0];

        for(int[] row:arr)
            for(int v:row)
                if(v>max) max=v;

        return max;
    }
}