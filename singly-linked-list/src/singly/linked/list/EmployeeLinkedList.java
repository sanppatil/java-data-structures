package singly.linked.list;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public EmployeeLinkedList() {
        size = 0;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head); // current head of list becomes next of new node
        head = node;    //Makes new node as head of list
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);  //clean references
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
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print(" NULL ");

    }
}
