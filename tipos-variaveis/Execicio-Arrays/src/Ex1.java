public class Ex1 {
    public static void main(String[] args) {
        int[] vetor ={0,2,3,4,6,6};
        int count = 0;


        while (count < (vetor.length)){
            System.out.print(vetor[count]);
            count++;
        }


        for (int i = (vetor.length -1); i >= 0 ; i-- ){
            System.out.print(vetor[i] + " ");
        }

    }
}
