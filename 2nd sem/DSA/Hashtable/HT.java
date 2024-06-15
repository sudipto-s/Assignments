import java.util.ArrayList;

public class HT {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node (String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HT () {
        dataMap = new Node[size];
    }

    public void print() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i+":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("    {"+temp.key+"="+temp.value+"}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keychar = key.toCharArray();
        for (int i = 0; i < keychar.length; i++) {
            int ascii = keychar[i];
            hash = (hash + ascii * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node nN = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = nN;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nN;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allkeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allkeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allkeys;
    }
}
