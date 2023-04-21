import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int numero;
         int maior = 0;
         int count = 0;
         int media = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();
            media = numero + media;
                if (numero > maior )maior = numero ;
            count = count +1;
        }while (count < 5);
        media = media / count;

        System.out.println("maior :" +maior);
        System.out.println(media);



    }
}
