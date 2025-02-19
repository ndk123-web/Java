// key cant be change       (Set)
// values can be change     (List)

import java.util.HashMap;
import java.util.Map;

public class Map_Inter {
    public static void main(String[] args) {

        Map<String, Integer> num = new HashMap<>();

        num.put("Ndk", 10);
        num.put("Ysh", 19);
        num.put("Shbm", 8);
        num.put("Ndk", 20);

        // keySet() return the key values
        // get() return the valye of that given key
        // containsValue(value) return boolean
        // containsKey(key) return boolean
        // new.putall(old) copies all old data to new

        Map<String, Integer> newnum = new HashMap<>();
        newnum.putAll(num);

        for (String key : newnum.keySet()) {
            System.out.println(key + " : " + newnum.get(key));
        }

    }
}