package hashtable.chaining;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < this.hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.getKey().equals(key)) {
                return employee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = 0;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.getKey().equals(key)) {
                break;
            }
        }
        if (employee == null)
            return null;
        else {
            hashtable[hashedKey].remove(--index);
            return employee.getEmployee();
        }

    }

    private int hashKey(String key) {
        return Math.abs(key.length() % hashtable.length);
    }

    public void printHashTable() {
        for (int i = 0; i < this.hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + " -> EMPTY");
            } else {
                System.out.print("Position " + i + " -> ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().getEmployee());
                    System.out.print(" -> ");
                }
                System.out.print("NULL\n");
            }
        }
    }
}
