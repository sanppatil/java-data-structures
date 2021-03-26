package array.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
        front = 0;
        back = 0;
    }

    public void enQueue(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
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
        }
        return removeEmployee;
    }


    public Employee peek() {
        if (size() == 0)
            throw new NoSuchElementException();
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public Employee[] getQueue() {
        return queue;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
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
