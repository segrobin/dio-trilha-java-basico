import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("crie um dicionário que relacione os modelos e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("celta",10.5);
            put("palio",10.3);
            put("uno",9.4);
            put("kwid",8.4);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entrey : entries){
            if (entrey.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entrey.getKey();
                System.out.println("modelo mais eficienete " + modeloMaisEficiente + " " + consumoMaisEficiente);
            }
        }
        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficinete = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficinete)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente"+ modeloMenosEficiente +"" +consumoMenosEficinete);
            }
        }
        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Media "+ soma/carrosPopulares.size());
        System.out.println("Remoca os modelos com consumo igual 15,6 ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }



    }
}