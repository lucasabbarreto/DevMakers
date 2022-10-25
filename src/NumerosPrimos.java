import java.util.Scanner;
import java.util.Arrays;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primo;
        int[] tempArray;
        int[] finalArray;

        System.out.println("digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("digite o primeiro numero");
        int num2 = sc.nextInt();

        finalArray = new int[0];
        int counter2 = 0;

        for (int i = num1; i <= num2; i++) {

            int counter1 = 0;
            if (i > 1) {
                for(int j = 1; j <= i; j++){
                    if(i % j == 0) {
                        counter1++;
                    }
                }
                if(counter1 <= 2){
                    primo = i;
                    counter2++;
                    tempArray = finalArray;
                    finalArray = Arrays.copyOf(tempArray, counter2);
                    finalArray[counter2-1] = primo;

                }
            }
        }
        System.out.printf("Os números primos do intervalo " + num1 + " a " + num2 +" são: " + Arrays.toString(finalArray));
    }
}