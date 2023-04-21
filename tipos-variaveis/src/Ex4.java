import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantiNumero;
        int count = 0;
        int numero;
        int quantiPare = 0;
        int quantiImpar =- 0;

        System.out.println("Quatidade de numeros : ");
        quantiNumero = scan.nextInt();
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantiPare++;
            else quantiImpar++;

            count++;
        }while (count < quantiNumero);
        System.out.println("Quantidade Par : " +quantiPare);
        System.out.println("Quantidade Impar: "+ quantiImpar);
    }
}
