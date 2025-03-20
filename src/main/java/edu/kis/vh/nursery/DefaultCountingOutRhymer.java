package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int ELEMENTS = 12;
    private final int SOME_NUMBER = -1;

    private int[] NUMBERS = new int[ELEMENTS];

    public int total = SOME_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == SOME_NUMBER;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return SOME_NUMBER;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return SOME_NUMBER;
        return NUMBERS[total--];
    }

}
