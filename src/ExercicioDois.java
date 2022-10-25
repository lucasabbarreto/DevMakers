import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        if(args.length == 0){
            Scanner sc = new Scanner(System.in);
            float numero1, numero2, resultado;

            System.out.println("Insira os numeros para a soma");
            System.out.println("Insira o primeiro numero");
            numero1 = sc.nextFloat();

            System.out.println("Insira o segundo numero");
            numero2 = sc.nextFloat();

            resultado = numero1 + numero2;
            System.out.printf("A soma de %f mais %f eh %f", numero1, numero2, resultado);

        } else if(args.length == 1){
            Scanner sc = new Scanner(System.in);
            float numero1, numero2, resultado;
            numero1 = Float.parseFloat(args[0]);

            System.out.println("Insira mais um numero para fazer a soma");
            numero2 = sc.nextFloat();

            resultado = numero1 + numero2;
            System.out.printf("A soma de %f mais %f eh %f", numero1, numero2, resultado);

        } else if(args.length == 2){
            float numero1 = Float.parseFloat(args[0]);
            float numero2 = Float.parseFloat(args[1]);

            float resultado = numero1 + numero2;

            System.out.printf("%f + %f = %f", numero1, numero2, resultado);

        } else if(args.length > 2){
            System.out.println("Quantidade de parametros invalida");
        }
    }
}
