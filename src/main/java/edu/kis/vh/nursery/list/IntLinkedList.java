package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int DEFAULT_RETURN = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())return DEFAULT_RETURN;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN;
        last = last.getPrev();
        return ret;
    }
}
