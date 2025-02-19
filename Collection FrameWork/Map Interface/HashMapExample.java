import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Add key-value pairs
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        // Print the map
        System.out.println("Initial map: " + map);

        // Retrieve value by key
        String value = map.get("2");
        System.out.println("Value for key '2': " + value);

        // Check if a key is present
        boolean hasKey = map.containsKey("3");
        System.out.println("Map contains key '3': " + hasKey);

        // Check if a value is present
        boolean hasValue = map.containsValue("One");
        System.out.println("Map contains value 'One': " + hasValue);

        // Remove a key-value pair
        map.remove("1");
        System.out.println("Map after removing key '1': " + map);

        // Get the size of the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);

        // Add more key-value pairs
        map.put("4", "Four");
        map.put("5", "Five");

        // Replace a value
        map.replace("4", "Four", "Four Updated");
        System.out.println("Map after replacing value for key '4': " + map);

        // Compute a new value for a key
        map.compute("5", (k, v) -> v == null ? "Default" : v + " Updated");
        System.out.println("Map after computing new value for key '5': " + map);

        // Compute value if absent
        map.computeIfAbsent("6", k -> "Six");
        System.out.println("Map after computing value if absent for key '6': " + map);

        // Compute value if present
        map.computeIfPresent("5", (k, v) -> v + " - Present");
        System.out.println("Map after computing value if present for key '5': " + map);

        // Merge values
        map.merge("6", " Added", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Map after merging value for key '6': " + map);

        // Print keys, values, and entries
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
