package project;

import java.util.*;

public class Task3 {

    private Map<String, List<String>> storage;

    public Task3() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        List<String> values = storage.get(key);
        if (values == null) {
            values = new ArrayList<>();
        }
        values.add(value);
        storage.put(key, values);
    }

    public void printValues(String key) {
        List<String> values = storage.get(key);
        if (values == null) {
            System.out.println("No values for this key");
        } else {
           values.forEach(System.out::println);
           values.forEach(value -> System.out.println(value)); // same thing as above
        }
    }


    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void mapMethods() {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 15); // place element inside map
        int number = map.get("key1"); // get the element under the given key

        map.put("key2", 15); // put element
        map.put("key1", 12); // override element under key1

        boolean exists = map.containsKey("jakis klucz"); // if this key exists in a map
        boolean exists2 = map.containsValue(90); // if this value exists

        map.remove("key2"); // remove a key and its value
        for (String keys : map.keySet()) { // Set<String> - iterate over keys in a map

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // iterate over entries (key and value)
            String key = entry.getKey();
            int value = entry.getValue();


        }

        map.forEach((key, value) -> { // same as above

        });
    }
}
