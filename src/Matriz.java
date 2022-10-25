import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        boolean valor = false;
        while(!valor){
            try{
                getNumber();
                valor = true;
            } catch(InputMismatchException e) {
                System.out.println("Digite um número inteiro");
                getNumber();
            } finally {
                int
                System.out.println(num);
            }
        }
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();

        return num;
    }

}
