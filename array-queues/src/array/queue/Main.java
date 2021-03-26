package array.queue;

public class Main {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        arrayQueue.enQueue(sandipEmployee);
        arrayQueue.enQueue(jackEmployee);
        arrayQueue.enQueue(gauravEmployee);
        arrayQueue.enQueue(petersonEmployee);
        arrayQueue.enQueue(billEmployee);

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        System.out.println();

        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.size());

        System.out.println();

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

        arrayQueue.enQueue(sandipEmployee);
        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();

    }

}
