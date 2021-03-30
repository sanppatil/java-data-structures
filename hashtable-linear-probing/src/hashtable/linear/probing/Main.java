package hashtable.linear.probing;

public class Main {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "Dole", 78);

        HashTableLinearProbing hashTableLinearProbing = new HashTableLinearProbing(10);

        hashTableLinearProbing.put("Patil", sandipEmployee);
        hashTableLinearProbing.put("Smith", jackEmployee);
        hashTableLinearProbing.put("Jain", gauravEmployee);
        hashTableLinearProbing.put("Pius", petersonEmployee);
        hashTableLinearProbing.put("Dole", billEmployee);

        System.out.println();

        hashTableLinearProbing.printHashTable();

        System.out.println();

        System.out.println("Retrieve key for Patil -> " + hashTableLinearProbing.get("Patil"));
        System.out.println("Retrieve key for Smith -> " + hashTableLinearProbing.get("Smith"));

        System.out.println();

        System.out.println("Retrieve key for Smith -> " + hashTableLinearProbing.get("Smith"));

        System.out.println();

        System.out.println("Removed Key for Pius -> " + hashTableLinearProbing.remove("Pius"));

        System.out.println();

        hashTableLinearProbing.printHashTable();

        System.out.println();

        System.out.println("Retrieve key for Dole -> " + hashTableLinearProbing.get("Dole"));

    }

}
