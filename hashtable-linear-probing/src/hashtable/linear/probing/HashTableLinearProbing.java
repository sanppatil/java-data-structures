package hashtable.linear.probing;

public class HashTableLinearProbing {

    private StoredEmployee[] hashtable;

    public HashTableLinearProbing() {
        hashtable = new StoredEmployee[10];
    }

    public HashTableLinearProbing(int capacity) {
        hashtable = new StoredEmployee[capacity];
    }


    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean occuipied(int index) {
        return hashtable[index] != null;
    }

    public void put(String key, Employee employee) {
        int hashkey = hashKey(key);
        if (occuipied(hashkey)) {
            int stopIndex = hashkey;
            if (hashkey == hashtable.length - 1)
                hashkey = 0;
            else
                hashkey++;

            while (occuipied(hashkey) && hashkey != stopIndex) {
                hashkey = (hashkey + 1) % key.length();
            }
        }
        if (occuipied(hashkey))
            System.out.println("Sorry, There is already employee at position - " + hashkey);
        else
            hashtable[hashkey] = new StoredEmployee(key, employee);
    }

    public Employee remove(String key) {
        int hashkey = findKey(key);
        if (hashkey == -1)
            return null;
        Employee employee = hashtable[hashkey].getEmployee();

        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].getKey(), oldHashTable[i].getEmployee());
            }
        }
        hashtable[hashkey] = null;
        return employee;
    }

    private int findKey(String key) {
        int hashkey = hashKey(key);
        if (hashtable[hashkey] != null && hashtable[hashkey].getKey().equals(key)) {
            return hashkey;
        }
        int stopIndex = hashkey;
        if (hashkey == hashtable.length - 1)
            hashkey = 0;
        else
            hashkey++;

        while (hashkey != stopIndex && hashtable[hashkey] != null && !hashtable[hashkey].getKey().equals(key)) {
            hashkey = (hashkey + 1) % key.length();
        }

        if (hashtable[hashkey] != null && hashtable[hashkey].getKey().equals(key))
            return hashkey;
        else
            return -1;
    }

    public Employee get(String key) {
        int hashkey = findKey(key);
        if (hashkey == -1)
            return null;
        else
            return hashtable[hashkey].getEmployee();
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null)
                System.out.println("Empty");
            else
                System.out.println("Position -> " + i + " : " + hashtable[i].getEmployee());
        }
    }

}
