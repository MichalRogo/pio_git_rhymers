package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int ELEMENTS = 12;
    private final int DEFAULT_RETURN = -1;
    private int[] numbers = new int[ELEMENTS];
    private final int INITIAL_INDEX = -1;

    public int total = INITIAL_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_INDEX;
    }

    public boolean isFull() {
        return total == ELEMENTS-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return DEFAULT_RETURN;
        }
        return numbers[total--];
    }
}
