import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite os valores que deseja adicionar ao cálculo da média aritmética, e ao finalizar, digite -1 para finalizar o cálculo.");
        float nota, media;
        float contador = 0;
        float soma = 0;

        do {
            System.out.println("Digite um valor.");
            nota = sc.nextFloat();
            if(nota !=-1){
            ++contador;
            soma += nota;
            } else{
                media = soma / contador;
                System.out.printf("A média é %f", media);
            }
        } while (nota != -1);
    }
}
