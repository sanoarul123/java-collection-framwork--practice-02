import java.util.Map;
import java.util.HashMap;

public class LearnMap {

    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);

        // if (numbers.containsKey("Two")) {

        // numbers.put("Two", 203);
        // }

        // numbers.putIfAbsent("Two", 203);
        System.out.println(numbers);

        // Iteration in map
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {

            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());

            for (String key : numbers.keySet()) {

                System.out.println(key);
            }

            for (Integer value : numbers.values()) {

                System.out.println(numbers.containsValue(3));
            }

        }
    }

}
