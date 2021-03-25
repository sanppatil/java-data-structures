package linked.stack;

public class Main {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        LinkedStack linkedStack = new LinkedStack();

        System.out.println(linkedStack.isEmpty());
        linkedStack.push(sandipEmployee);
        linkedStack.push(jackEmployee);
        linkedStack.push(gauravEmployee);
        linkedStack.push(petersonEmployee);
        linkedStack.push(billEmployee);
        System.out.println(linkedStack.size());

        linkedStack.printStack();

        System.out.println();
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.size());




    }

}
