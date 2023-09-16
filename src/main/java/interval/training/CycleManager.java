package interval.training;

import interval.training.models.Cycle;

public class CycleManager {
    private Cycle cycle;

    public CycleManager(Cycle cycle) {
        this.cycle = cycle;
    }

    public void startCycle() {
        this.cycle.startWorkout();
        while (!this.cycle.getWorkoutTime().isPeriodEnd()){
            //willsynchronize becaouse of sout
            System.out.println("helo");
        }

        this.cycle.startBreak();

        while(!this.cycle.isBreakEnd()){
            //will not synchronize
        };
        System.out.println("wykonana calość");

    }
}
