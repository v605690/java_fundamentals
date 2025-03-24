package labs_examples.datastructures.hashmap.labs;

//import java.util.LinkedList;

@SuppressWarnings("ALL")
public class HashMap<K, V> {
    private HashMapNode<K, V>[] data = new HashMapNode[10];

    private int harsher(K key) {
        int index = Math.abs(key.hashCode() % data.length);

        return index;
    }
    public void put(K key, V value) {
        int index = harsher(key);

        if (data[index] == null) {
            data[index] = new HashMapNode<>(key, value);

        } else {

            HashMapNode<K, V> newNode = data[index];

            newNode.next = newNode.head;
            newNode.head = newNode;
        }
        if (values().size() > data.length * .75) {
            resize();
        }
    }

    private void resize() {
        HashMapNode<K, V>[] old = data;

        data = new HashMapNode[old.length * 2];

        for (int i = 0; i < old.length; i++) {
            try {
                HashMapNode hashMapNode = old[i];

                put((K) hashMapNode.getKey(), (V) hashMapNode.getValue());

                while (hashMapNode.next != null) {
                    hashMapNode = hashMapNode.next;
                    put((K) hashMapNode.getKey(), (V) hashMapNode.getValue());
                }
            } catch (Exception e) {

            }
        }
    }

    public MyCustomLinkedList<V> values() {
        MyCustomLinkedList<V> values = new MyCustomLinkedList<>();

        for (int index = 0; index < data.length; index++) {
            if (data[index] != null) {
                HashMapNode<K, V> ge = data[index];

                while (ge != null) {
                    values.addFirst(ge.getValue());
                    ge = ge.next;
                }
            }
        }
    return values;
    }

    public V get(K key) {
        int index = harsher(key);

        if (data[index] == null) {
           return null;
        }
        HashMapNode<K, V> entryObject = data[index];

        while (entryObject.getKey() != key) {
            if (entryObject.next == null) {

                return (V) "The object does not exist";
            }
            entryObject = entryObject.next;
        }
        return entryObject.getValue();
    }
}

