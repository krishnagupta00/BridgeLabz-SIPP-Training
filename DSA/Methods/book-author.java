import java.util.HashMap;

public class book-author {

    public static void insert(HashMap<String, String> map, String key, String value) {
        map.put(key, value);
        System.out.println("Inserted (" + key + ", " + value + ")");
    }

    public static void delete(HashMap<String, String> map, String key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Deleted key: " + key);
        } else {
            System.out.println("Key not found: " + key);
        }
    }

 public static void +y
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        insert(map, "book1", "auth1");
        insert(map, "book2", "auth2");
        insert(map, "book3", "auth3");

        System.out.println("Map after insertions: " + map);

        delete(map, "book2");

        System.out.println("Map after deletion: " + map);
    }
}
