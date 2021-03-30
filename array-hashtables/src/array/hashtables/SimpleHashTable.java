package array.hashtables;

public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public SimpleHashTable(int capacity) {
        hashtable = new Employee[capacity];
    }


    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int hashkey = hashKey(key);
        if (hashtable[hashkey] != null)
            System.out.println("Sorry, There is already employee at position - " + hashkey);
        else
            hashtable[hashkey] = employee;
    }

    public Employee get(String key) {
        int hashkey = hashKey(key);
        return hashtable[hashkey];
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("Position -> " + i + " : " + hashtable[i]);
        }
    }

}
