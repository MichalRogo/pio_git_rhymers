package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

<<<<<<< HEAD
    private int[] numbers = new int[12];
=======
    private final int ELEMENTS = 12;
    private final int SOME_NUMBER = -1;
>>>>>>> c5e24da24d20ba674a9afc318dc9a5a639079b29

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
<<<<<<< HEAD
            return -1;
        return numbers[total];
=======
            return SOME_NUMBER;
        return NUMBERS[total];
>>>>>>> c5e24da24d20ba674a9afc318dc9a5a639079b29
    }

    public int countOut() {
        if (callCheck())
<<<<<<< HEAD
            return -1;
        return numbers[total--];
=======
            return SOME_NUMBER;
        return NUMBERS[total--];
>>>>>>> c5e24da24d20ba674a9afc318dc9a5a639079b29
    }

}
