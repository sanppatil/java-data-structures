package jdk.linked.list;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        employeeLinkedList.addFirst(sandipEmployee);
        employeeLinkedList.addFirst(jackEmployee);
        employeeLinkedList.addFirst(gauravEmployee);
        employeeLinkedList.addFirst(petersonEmployee);

        employeeLinkedList.addLast(billEmployee);

        System.out.println(employeeLinkedList.removeFirst());
        System.out.println(employeeLinkedList.removeLast());

        System.out.print("HEAD <=> ");
        for (Employee employee : employeeLinkedList) {
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.print(" NULL ");

    }

}
