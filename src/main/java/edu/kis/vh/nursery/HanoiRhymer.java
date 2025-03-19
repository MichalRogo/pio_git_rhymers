package edu.kis.vh.nursery;

<<<<<<< HEAD
public class HanoiRhymer extends DefaultCountingOutRhymer{
=======
public class HanoiRhymer extends DefaultCountingOutRhymer {
>>>>>>> 6bd7702 (4.1 poprawa nazw klas)

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
