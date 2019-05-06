import java.util.HashMap;
import java.util.Hashtable;

public class HashTablevsHashMap {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable= new Hashtable<>();
        hashtable.put("firstKey", "firstValue");
        //null not allowed in key or value
        //hashtable.put(null, "secondValue");
        //hashtable.put("thirdKey", null);

        hashtable.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));

        System.out.println("size of hashtable: " + hashtable.size());

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("firstKey", "firstValue");
        hashMap.put(null, "secondValue");
        hashMap.put("thirdKey", null);
        hashMap.put("abc", "abcValue");
        hashMap.put("ghi", "ghiValue");

        hashMap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));

        System.out.println("size of hashMap: " + hashMap.size());
    }
}
