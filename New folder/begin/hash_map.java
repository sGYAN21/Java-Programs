import java.util.HashMap;

public class hash_map {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4 };
        for (int i = 0; i < arr.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(1, 1);
            System.out.println("Is Value " + map.containsKey(1));
            map.put(2, 1);
            System.out.println("Value is " + map.get(2));
            System.out.println(map.put(4, map.getOrDefault(4, 0) + 1));
            System.out.println("Map is " + map);
        }
    }
}