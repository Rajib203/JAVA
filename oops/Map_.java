import java.util.Map;
import java.util.HashMap;
public class Map_ {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("one",1);
        mp.put("two", 2);
        System.out.println(mp);
        mp.putIfAbsent("three", 4);
        System.out.println(mp);
        mp.remove("one");
        for(Map.Entry<String,Integer> e: mp.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
