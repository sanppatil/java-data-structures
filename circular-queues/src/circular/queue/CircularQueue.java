package circular.queue;

import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        queue = new Employee[capacity];
        front = 0;
        back = 0;
    }

    public void enQueue(Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(queue, front, newArray, 0, queue.length - front); // Copying items from front of queue
            System.arraycopy(queue, 0, newArray, queue.length - front, back); // Copying items from back of queue
            queue = newArray;
            front = 0;
            back = numItems;
        }
        queue[back] = employee;
        if (back < queue.length - 1)
            back++;
        else
            back = 0;
    }

    public Employee deQueue() {
        if (size() == 0)
            throw new NoSuchElementException();
        Employee removeEmployee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return removeEmployee;
    }


    public Employee peek() {
        if (size() == 0x3)
            throw new NoSuchElementException();
        return queue[front];
    }

    public int size() {
        if (front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }

    public Employee[] getQueue() {
        return queue;
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public void setQueue(Employee[] queue) {
        this.queue = queue;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }
}
