package src;

/**
 * Hello world!
 *
 */
public class Bisca 
{
    public static void main( String[] args )
    {
        Map<String, Integer> value = new TreeMap<>();
        value.put("2", 0);
        value.put("3", 0);
        value.put("4", 0);
        value.put("5", 0);
        value.put("6", 0);
        value.put("Q", 2);
        value.put("J", 3);
        value.put("K", 4);
        value.put("A", 11);
        value.put("7", 10);
    }
    String[] nipes = { " Copas", " Espada", " Ouros", " Paus" };
        List<String> cartas = new ArrayList<String>();
        String carta;
        for (int i = 0; i < 4; i++) {
            for (String key : value.keySet()) {
                carta = (key + nipes[i]);
                cartas.add(carta);
            }
        }
}
