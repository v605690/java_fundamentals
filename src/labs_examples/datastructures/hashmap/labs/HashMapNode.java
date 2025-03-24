package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

public class HashMapNode<K, V> {
    K key;
    V value;
    HashMapNode<K, V> next;
    HashMapNode<K, V> head;

    public void HashMap() {
        this.head = null;
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
