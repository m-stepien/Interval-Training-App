package interval.training;

import interval.training.models.Cycle;

public class Main {
    public static void main(String[] args) {
//        Training training = new Training(3, 30, 10, 20,5, 3);
//        IOInterface ioInterface = new TerminalIO();
        Cycle cycle = new Cycle(5, 2);

        CycleManager cycleManager = new CycleManager(cycle);
        cycleManager.startCycle();
    }
}