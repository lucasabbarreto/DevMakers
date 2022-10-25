import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        getNumber();
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            System.out.println(num);
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Numero deve ser do tipo inteiro");
            return getNumber();
        }
    }
}
