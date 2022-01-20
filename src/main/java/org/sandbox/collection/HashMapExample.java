package org.sandbox.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

  public static void main(String[] args) {
    Map<String, String> geogMap = new HashMap<>();
    geogMap.put("Pune", "Maharashtra");
    geogMap.put("Bangalore", "Karnataka");
    geogMap.put("Mumbai", "Maharashtra");

    System.out.println(geogMap);
    Set<String> keys = geogMap.keySet();
    Collection<String> values = geogMap.values();
    System.out.println(keys);
    System.out.println(values);

    Set<Map.Entry<String, String>> entries = geogMap.entrySet();

    entries.forEach(entry ->
      System.out.println(
        entry.getKey() + " => " + entry.getValue()
      )
    );

  }
}
