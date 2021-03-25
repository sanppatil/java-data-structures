package doubly.linked.list;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeDoublyLinkedList() {
        size = 0;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrevious(null); // previous field of new node at front is always null
        node.setNext(head); // current head of list becomes next of new node

        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;    //Makes new node as head of list
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(null); // next field of new node at end is always null
        node.setPrevious(tail); // current tail of list becomes previous of new node

        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;    //Makes new node as tail of list
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) // If list is empty
            return null;
        EmployeeNode removeNode = head;
        if (head.getNext() == null) // If list has only one node
            tail = null;
        else
            head.getNext().setPrevious(null);

        head = head.getNext();
        size--;
        removeNode.setNext(null);  //clean references
        return removeNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty())
            return null;
        EmployeeNode removeNode = tail;
        if (tail.getPrevious() == null)
            head = null;
        else
            tail.getPrevious().setNext(null);

        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);  //clean references
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD => ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.print(" NULL ");

    }
}
