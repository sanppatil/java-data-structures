package hashtable.chaining;

public class Main {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        ChainedHashTable chainedHashTable = new ChainedHashTable();

        chainedHashTable.put("Patil", sandipEmployee);
        chainedHashTable.put("Smith", jackEmployee);
        chainedHashTable.put("Jain", gauravEmployee);
        chainedHashTable.put("Pius", petersonEmployee);
        chainedHashTable.put("End", billEmployee);

        System.out.println();

        chainedHashTable.printHashTable();

        System.out.println();

        System.out.println("Removed key for Patil -> " + chainedHashTable.remove("Patil"));
        System.out.println();

        chainedHashTable.printHashTable();

        System.out.println();
        System.out.println("Retrieve key for Pius -> " + chainedHashTable.remove("Pius"));
        System.out.println();

        chainedHashTable.printHashTable();


    }

}
