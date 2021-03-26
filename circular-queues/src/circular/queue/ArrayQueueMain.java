package circular.queue;

public class ArrayQueueMain {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.enQueue(sandipEmployee);
        arrayQueue.enQueue(jackEmployee);
        arrayQueue.deQueue();
        arrayQueue.enQueue(petersonEmployee);
        arrayQueue.deQueue();
        arrayQueue.enQueue(gauravEmployee);
        arrayQueue.deQueue();
        arrayQueue.enQueue(billEmployee);
        arrayQueue.deQueue();
        arrayQueue.enQueue(sandipEmployee);
        arrayQueue.enQueue(jackEmployee);

        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();
    }

}
