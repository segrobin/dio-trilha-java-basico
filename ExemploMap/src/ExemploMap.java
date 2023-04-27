import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

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
            if (entrey.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entrey.getKey();
            System.out.println("modelo mais eficienete "+ modeloMaisEficiente +" "+ consumoMaisEficiente);
        }


    }
}