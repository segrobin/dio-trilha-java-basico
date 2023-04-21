import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = sc.nextInt();
        int multiplicaçao = 1;
        System.out.print(fatorial +"! = ");
        for (int i = fatorial; i >= 1 ; i-- ){
            multiplicaçao = multiplicaçao * i;

        }
        System.out.println(multiplicaçao);
    }
}
