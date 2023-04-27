
import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria ");
        Set<Serie> minhaSeries = new HashSet<>(){{
            add(new Serie("flash","super Heroi",60));
            add(new Serie("Dark","drama",70));
            add(new Serie("Vinking","guerra",90));
        }};
        for (Serie serie:minhaSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero()+ " - "+ serie.getTempoEpisodio());
        System.out.println(" ");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>(){{
            add(new Serie("flash","super Heroi",60));
            add(new Serie("Dark","drama",70));
            add(new Serie("Vinking","guerra",90));
        }};
        for (Serie serie:minhaSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero()+ " - "+ serie.getTempoEpisodio());
        System.out.println("Ordem natural");
        Set<Set> minhasSeries2 = Collections.singleton(new TreeSet<>(minhaSeries1));
        System.out.println(" ");
        for (Serie serie:minhaSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero()+ " - "+ serie.getTempoEpisodio());

    }


    static class Serie implements Comparable<Serie>{
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            if (!super.equals(object)) return false;
            Serie serie = (Serie) object;
            return java.util.Objects.equals(nome, serie.nome) && java.util.Objects.equals(genero, serie.genero) && java.util.Objects.equals(tempoEpisodio, serie.tempoEpisodio);
        }

        public int hashCode() {
            return Objects.hash(super.hashCode(), nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            int genero = this.getGenero().compareTo(serie.getGenero());
            return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        }
    }

}
