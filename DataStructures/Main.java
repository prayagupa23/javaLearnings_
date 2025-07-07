//hashmap in java
/*A famous data structure that stores key-value pairs
 { keys : value },
  keys are unique and values can be duplicated.
  They do not maintain any order, but they are memory efficient.
  
  HashMap<Key, Value>
*/

import java.util.HashMap;

public class Main{
  public static void main(String[] args) {
    HashMap<String, Double> map = new HashMap<>();
    map.put("Apple", 2.0);
    map.put("Orange", 1.5);
    map.put("Banana",3.0);
    //map.put("Orange",2.0); cannot put duplicate keys
    map.put("Cherry",1.5);
    // //map.remove("Cherry");
    // System.out.println(map.get("Cherry"));
    // System.out.println(map.containsKey("Cherry"));
    // System.out.println(map.containsValue(2.0));
    // System.out.println(map.size());
    for(String key : map.keySet()){
      System.out.println(key + ": $" + map.get(key));
    }
  }    
}