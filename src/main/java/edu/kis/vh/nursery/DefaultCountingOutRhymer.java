package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];
    private final int ELEMENTS = 12;
    private final int SOME_NUMBER = -1;

    private int[] NUMBERS = new int[ELEMENTS];

    public int total = SOME_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == SOME_NUMBER;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[total--];
    }
}
