package Queues;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class ImplementLruCache {

  private int capacity;
  private LinkedHashMap<Integer, String> linkedHashMap;

  public ImplementLruCache(int capacity) {
    this.capacity = capacity;
    this.linkedHashMap = new LinkedHashMap<Integer, String>();
  }

  public String get(int key) {
    String value = this.linkedHashMap.get(key);
    if (value == null) {
      value = "-1";
    } else {
      this.set(key, value);
    }
    return value;
  }

  public void set(int key, String value) {
    if (this.linkedHashMap.containsKey(key)) {
      this.linkedHashMap.remove(key);
    } else if (this.capacity == this.linkedHashMap.size()) {
      Iterator<Integer> it = this.linkedHashMap.keySet().iterator();
      it.next();
      it.remove();
    }
    this.linkedHashMap.put(key, value);
  }
}
