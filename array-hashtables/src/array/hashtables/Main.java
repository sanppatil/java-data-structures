package array.hashtables;

public class Main {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        SimpleHashTable simpleHashTable = new SimpleHashTable(10);

        simpleHashTable.put("Patil", sandipEmployee);
        simpleHashTable.put("Smith", jackEmployee);
        simpleHashTable.put("Jain", gauravEmployee);
        simpleHashTable.put("Pius", petersonEmployee);
        simpleHashTable.put("End", billEmployee);

        System.out.println();

        simpleHashTable.printHashTable();

        System.out.println();

        System.out.println("Retrieve key for Patil -> " + simpleHashTable.get("Patil"));
        System.out.println("Retrieve key for Smith -> " + simpleHashTable.get("Smith"));


    }

}
