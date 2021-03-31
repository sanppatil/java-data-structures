package hashtable.jdk;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        Map<String, Employee> hashmap = new HashMap<String, Employee>();
        hashmap.put("Patil", sandipEmployee);
        hashmap.put("Smith", jackEmployee);
        hashmap.put("Jain", gauravEmployee);
        //Employee emp = hashmap.put("Jain", petersonEmployee);
        //Employee emp = hashmap.putIfAbsent("Jain", petersonEmployee);
        //System.out.println(emp);

        for (Employee employee : hashmap.values()) {
            System.out.println(employee);
        }

        System.out.println();

        hashmap.forEach((K, V) -> {
            System.out.println(V);
        });

        System.out.println();

        System.out.println(hashmap.containsKey("Patil"));
        System.out.println(hashmap.containsValue(sandipEmployee));


        System.out.println(hashmap.get("Someone"));
        System.out.println(hashmap.getOrDefault("Someone", sandipEmployee));

        System.out.println();

        System.out.println(hashmap.remove("Patel"));

        System.out.println();

        hashmap.forEach((K, V) -> {
            System.out.println(V);
        });

    }

}
