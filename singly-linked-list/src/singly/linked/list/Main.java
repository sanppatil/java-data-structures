package singly.linked.list;

public class Main {

    public static void main(String[] args) {
        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 123);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 123);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 123);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(sandipEmployee);
        employeeLinkedList.addToFront(jackEmployee);
        employeeLinkedList.addToFront(gauravEmployee);
        employeeLinkedList.addToFront(petersonEmployee);

        employeeLinkedList.printList();

        System.out.println();

        System.out.println(employeeLinkedList.isEmpty());

        System.out.println(employeeLinkedList.getSize());

        System.out.println(employeeLinkedList.removeFromFront());
        employeeLinkedList.printList();


    }

}
