package vector;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();

        //This is test
        employeeList.add(new Employee("Sandip", "Patil", 123));
        employeeList.add(new Employee("Punam", "Jangale", 467));
        employeeList.add(new Employee("Peterson", "Pius", 986));
        employeeList.add(new Employee("Jack", "Smith", 7));

        employeeList.add(new Employee("Gaurav", "Jain", 765));

        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        System.out.println(employeeList.get(0));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Neel", "Patil", 125));

        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        System.out.println(employeeList.size());

        employeeList.add(1, new Employee("Punam", "Jangale", 467));

        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        System.out.println();

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println();

        System.out.println(employeeList.contains(new Employee("Sandip", "Patil", 123)));

        System.out.println();

        System.out.println(employeeList.indexOf(new Employee("Peterson", "Pius", 986)));

        System.out.println();

        employeeList.remove(new Employee("Peterson", "Pius", 986));

        employeeList.forEach(employee ->
            System.out.println(employee)
        );
    }

}
