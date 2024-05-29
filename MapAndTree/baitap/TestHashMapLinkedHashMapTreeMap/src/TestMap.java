import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("Smith", 30);
        hashMap.put("John", 31);
        hashMap.put("Bob", 29);
        hashMap.put("Jack", 32);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+"\n");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap+"\n");
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("John", 31);
        linkedHashMap.put("Bob", 29);
        linkedHashMap.put("Jack", 32);
        System.out.println("\nThe age for " + "Smith is " + linkedHashMap.get("Smith"));
    }
}