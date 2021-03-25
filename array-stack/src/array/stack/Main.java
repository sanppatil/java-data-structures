package array.stack;

public class Main {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(10);

        Employee sandipEmployee = new Employee("Sandip", "Patil", 123);
        Employee jackEmployee = new Employee("Jack", "Smith", 456);
        Employee gauravEmployee = new Employee("Gaurav", "Jain", 345);
        Employee petersonEmployee = new Employee("Peterson", "Pius", 875);
        Employee billEmployee = new Employee("Bill", "End", 78);

        arrayStack.push(sandipEmployee);
        arrayStack.push(jackEmployee);
        arrayStack.push(gauravEmployee);
        arrayStack.push(petersonEmployee);
        arrayStack.push(billEmployee);
        System.out.println(arrayStack.size());

        arrayStack.printStack();

        System.out.println();

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.size());


        System.out.println();

        arrayStack.printStack();
        System.out.println(arrayStack.size());



    }

}
