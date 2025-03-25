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
        if (this.get(key) != null) {
            return;
        }
        int index = harsher(key);

        if (data[index] == null) {
            data[index] = new HashMapNode<>(key, value);

        } else {
                                                         // At Data[9] we have at index 9 -> (9: [John] -> null)
            HashMapNode<K, V> newNode = new HashMapNode<>(key, value); // We create a new node [Nick] -> null
            newNode.next = data[index]; // Assign old head to tail of newNode [Nick] -> [John] -> null
            data[index] = newNode; // Data[index] is the newNode which is [Nick]

        }
        if (values().size() > data.length * .60) {
            resize();
        }
    }

    private void resize() {
        HashMapNode<K, V>[] old = data;

        data = new HashMapNode[old.length * 3];

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
            //System.out.println("The item does not exist");
            return null;
        }
        HashMapNode<K, V> entryObject = data[index];

        while (entryObject.getKey() != key) {
            if (entryObject.next == null) {
                //System.out.println("The object does not exist");
                return null;
            }
            entryObject = entryObject.next;
        }
        return entryObject.getValue();
    }

    public Object checkKeys(K key) {
        int index = harsher(key);

        if (data[index] == null) {
            return "Key does not exist";
        } else if (data[index].key.equals(key)) {

            return data[index].key;
        }
            return "Key does not exist";
    }
}

