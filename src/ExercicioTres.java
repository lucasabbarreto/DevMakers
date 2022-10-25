import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);
    float numero1, numero2, resultado;

        System.out.println("Digite + para somar");
        System.out.println("Digite - para subtrair");
        System.out.println("Digite / para dividir");
        System.out.println("Digite * para multiplicar");

        String operacao = sc.nextLine();

        if(operacao.equals("+")){
            System.out.println("Digite o primeiro número para fazer a soma");
            numero1 = sc.nextFloat();

            System.out.println("Digite o segundo número para fazer a soma");
            numero2 = sc.nextFloat();

            resultado = numero1 + numero2;

            System.out.printf("%f mais %f é igual a %f", numero1, numero2,  resultado);

        } else if(operacao.equals("-")){
            System.out.println("Digite o primeiro número para fazer a subtração");
            numero1 = sc.nextFloat();

            System.out.println("Digite o segundo número para fazer a subtração");
            numero2 = sc.nextFloat();

            resultado = numero1 - numero2;

            System.out.printf("%f menos %f é igual a %f", numero1, numero2,  resultado);

        } else if(operacao.equals("/")){
            System.out.println("Digite o primeiro número para fazer a divisão");
            numero1 = sc.nextFloat();

            System.out.println("Digite o segundo número para fazer a divisão");
            numero2 = sc.nextFloat();

            resultado = numero1 / numero2;

            System.out.printf("%f dividido por %f é igual a %f", numero1, numero2,  resultado);

        } else if(operacao.equals("*")){
            System.out.println("Digite o primeiro número para fazer a multiplicação");
            numero1 = sc.nextFloat();

            System.out.println("Digite o segundo número para fazer a multiplicação");
            numero2 = sc.nextFloat();

            resultado = numero1 * numero2;

            System.out.printf("%f vezes %f é igual a %f", numero1, numero2,  resultado);

        } else {
            System.out.println("Esta opção é inválida. :P");
        }
    }
}
