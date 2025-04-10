import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Value for key 2: " + map.get(2));

        System.out.println("Key-Value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.remove(2);
        System.out.println("After removing key 2: " + map);

        System.out.println("Contains key 3? " + map.containsKey(3));

        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
    }
}
