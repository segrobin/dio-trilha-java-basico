import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Gato> meusgatos = new ArrayList<>(){{
            add(new Gato("gabroe",18,"preto"));
            add(new Gato("Simba",6,"azil"));
            add(new Gato("asas",12,"amarelo"));
        }};
        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(meusgatos);
        System.out.println("--\tOrdem de aletoria\t--");
        Collections.shuffle(meusgatos);
        System.out.println(meusgatos);
        System.out.println("--\tOrdem de natural (Nome)\t--");
        Collections.sort(meusgatos);
        System.out.println(meusgatos);
        Collections.sort(meusgatos,new ComparatorIdade());
        meusgatos.sort(new ComparatorIdade());


    }
    static class Gato implements Comparable<Gato> {
        private String nome;
        private Integer idade;
        private String cor;
        public Gato(String nome, Integer idade, String cor){
            this.nome = nome;
            this.idade =idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }
}
class ComparatorIdade implements Comparator<Main.Gato>{

    @Override
    public int compare(Main.Gato g1, Main.Gato g2) {

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}