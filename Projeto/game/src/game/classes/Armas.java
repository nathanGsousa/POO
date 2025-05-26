package game.classes;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Armas {

    //Map<String> armas = new TreeMap<>();

    private static final Map<String, Map<String, int[]>> DADOS = new HashMap<>();
    private static final Random RANDOM =  new Random();

    static{
        Map<String, int[]> melee = new HashMap<>();
        melee.put("espada", new int[]{10, 1});
        melee.put("machado", new int[]{12, 1});
        melee.put("lança", new int[]{9, 2});

        Map<String, int[]> tank = new HashMap<>();
        tank.put("escudo", new int[]{6, 1});
        tank.put("martelo", new int[]{9, 1});

        Map<String, int[]> longDistance = new HashMap<>();
        longDistance.put("arco", new int[]{9, 3});
        longDistance.put("besta", new int[]{6, 4});
        longDistance.put("grimorio", new int[]{7,4});

        DADOS.put("melee", melee);
        DADOS.put("tank", tank);
        DADOS.put("longdistance", longDistance);
        
    }

    //Método de seleção aleatoria de arma para uma classe
    public static String armaRandom(String tipoClasse){
        if (tipoClasse == null || tipoClasse.isEmpty()) {
        throw new IllegalArgumentException("Tipo de classe não pode ser nulo ou vazio ");
        }

        Map<String, int[]> armas = DADOS.get(tipoClasse.toLowerCase());
        if (armas == null || armas.isEmpty()) return null;

        // Converte o conjunto de chaves para uma lista
        List<String> nomes = new ArrayList<>(armas.keySet());
        
        //Retorna um nome de arma aleatorio
        return nomes.get(RANDOM.nextInt(nomes.size()));
    }


    public static Map.Entry<String, int[]> getDadosArmas(String tipoClasse) {
        String nomeArma = Armas.armaRandom(tipoClasse);
        if (tipoClasse == null || nomeArma == null || tipoClasse.isEmpty() || nomeArma.isEmpty()) {
            throw new IllegalArgumentException("Tipo de classe e nome da arma não podem ser nulos ou vazios.");
        }

        Map<String, int[]> armas = DADOS.get(tipoClasse.toLowerCase());
        if (armas == null) {
            throw new IllegalArgumentException("Tipo de classe '" + tipoClasse + "' não encontrado.");
        }

        int[] dados = armas.get(nomeArma.toLowerCase());

        if (dados == null) {
            throw new IllegalArgumentException("Arma '" + nomeArma + "' não encontrada para a classe '" + tipoClasse + "'.");
        }

        return new AbstractMap.SimpleEntry<>(nomeArma, dados);
    }

}