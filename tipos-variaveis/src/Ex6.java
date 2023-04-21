import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int numero;
        int resultado;
        int counttabuada = 1;
        System.out.println("Insira o numero que deseja ver a tabuada: ");
        numero = sc.nextInt();
        do {
            resultado = numero * counttabuada;
            System.out.println(numero+" X "+counttabuada+" = "+ resultado);
            counttabuada ++;
            count++;
        }while (count != 10);

    }
}
