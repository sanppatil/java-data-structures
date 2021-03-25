package doubly.linked.list;

public class Main {

    public static void main(String[] args) {
        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();
        employeeDoublyLinkedList.addToFront(sandipEmployee);
        employeeDoublyLinkedList.addToFront(jackEmployee);
        employeeDoublyLinkedList.addToFront(gauravEmployee);
        employeeDoublyLinkedList.addToFront(petersonEmployee);

        employeeDoublyLinkedList.addToEnd(billEmployee);

        employeeDoublyLinkedList.removeFromFront();

        employeeDoublyLinkedList.removeFromEnd();

        employeeDoublyLinkedList.printList();
    }

}
