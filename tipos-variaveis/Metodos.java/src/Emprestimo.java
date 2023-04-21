
public class Emprestimo {

   public static void parcela(int quantiParcela){
       switch (quantiParcela){
           case 1:
               valorAvista();
           case 2:
               taxaJuros();
           case 3 :
               taxaJuros2();
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
               taxaJuros3();
           default:
               System.out.println("O emprestimo so e feito em 12 vezes");


       }


   }


    public static double valorAvista() {

       return 0;

    }

    public static double taxaJuros3() {
       return 4.3;
    }

    public static double taxaJuros2() {
       return 2.5;


   }

    public static double taxaJuros(){
       return 1.5;

   }





}