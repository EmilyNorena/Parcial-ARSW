
package edu.eci.arsw.math;
public class Calculate extends Thread {
    private int start;
    private int end;
    private byte[] localNumbers;
    private static volatile boolean paused = false;

    public Calculate(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i = start; i < end && !paused; i++) {
            localNumbers = PiDigits.calculate(start, end);
        }
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public byte[] getLocalNumbers() {
        return localNumbers;
    }
}