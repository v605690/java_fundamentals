package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

public class HashMapNode<K, V> {
    K key;
    V value;
    HashMapNode<K, V> next;

    public void HashMap() {
        this.next = null;
    }

    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
