package circular.queue;

public class CircularQueueMain {

    public static void main(String[] args) {

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enQueue(sandipEmployee);
        circularQueue.enQueue(jackEmployee);
        circularQueue.deQueue();
        circularQueue.enQueue(petersonEmployee);
        circularQueue.deQueue();
        circularQueue.enQueue(gauravEmployee);
        circularQueue.deQueue();
        circularQueue.enQueue(billEmployee);
        circularQueue.deQueue();
        circularQueue.enQueue(sandipEmployee);
        circularQueue.enQueue(jackEmployee);

        System.out.println(circularQueue.size());
        circularQueue.printQueue();

        System.out.println("======================================================================================================");

        CircularQueue circularQueue1 = new CircularQueue(10);

        circularQueue1.enQueue(sandipEmployee);
        circularQueue1.enQueue(jackEmployee);
        circularQueue1.enQueue(gauravEmployee);
        circularQueue1.enQueue(petersonEmployee);
        circularQueue1.enQueue(billEmployee);

        System.out.println(circularQueue1.size());
        circularQueue1.printQueue();

        System.out.println();

        System.out.println(circularQueue1.peek());
        System.out.println(circularQueue1.deQueue());
        System.out.println(circularQueue1.peek());
        System.out.println(circularQueue1.size());

        System.out.println();

        System.out.println(circularQueue1.size());
        circularQueue1.printQueue();

        circularQueue1.deQueue();
        circularQueue1.deQueue();
        circularQueue1.deQueue();
        circularQueue1.deQueue();

        System.out.println(circularQueue1.size());
        circularQueue1.printQueue();

        circularQueue1.enQueue(sandipEmployee);
        System.out.println(circularQueue1.size());
        circularQueue1.printQueue();

    }

}
