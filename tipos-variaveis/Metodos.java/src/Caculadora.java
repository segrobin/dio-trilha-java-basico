import java.util.Scanner;

public class Caculadora {

    public static void soma(double numero1,double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O resultado da soma é "+ resultado);
    }
    public static void multiplicacao(double numero1,double numero2 ){
        double resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é "+resultado);
    }
    public static void divisao(double numero1,double numero2){
        double resultado =numero1 / numero2;
        System.out.println("O resultado da divisão é "+resultado);
    }
    public static void substracao(double numero1,double numero2){
        double resultado = numero1 - numero2;
        System.out.println("O resultado da subtração e "+ resultado);
    }
}
