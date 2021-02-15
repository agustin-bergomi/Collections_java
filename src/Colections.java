import java.util.ArrayList;
import java.util.List;

public class Colections {
    public static void main(String[] args) {
        //Creo una variable de tipo List y con el constructor de ArrayList
        List<String> words = new ArrayList<>();
        //Le agrego elementos al listado
        words.add("Apple");
        words.add("Bat");
        words.add("Cat");
        //para conocer el tamaño de una coleccion se usa size (para arrays se usa length)
        System.out.println(words.size());
        //verificar si el listado esta vacio
        System.out.println(words.isEmpty());
        //conocer el primer elmento del listado
        System.out.println(words.get(0));
        //verificar si un elemento existe en el listado
        System.out.println(words.contains("Apple"));



    }
}
