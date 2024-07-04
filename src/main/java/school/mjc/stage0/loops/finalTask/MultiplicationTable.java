package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){ //i*1=i i*2=2i
        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " x " + numberTableToPrint + " = " + i*numberTableToPrint + "\n");
        }
    }
}
