import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAletorios = new int[20];

        for (int i = 0; i < numerosAletorios.length;i++){
            int numero = random.nextInt(100);
            numerosAletorios[i] = numero;
        }
        for (int numero : numerosAletorios) {
            System.out.print((numero -1)+"");
        }
        for (int numero : numerosAletorios) {
            System.out.print((numero + 1) +" ");

        }

    }
}
