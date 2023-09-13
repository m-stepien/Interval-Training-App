package interval.training;

import interval.training.models.Cycle;

public class CycleManager {
    private Cycle cycle;
    private IOInterface io;

    public CycleManager(Cycle cycle, IOInterface io) {
        this.cycle = cycle;
        this.io = io;
    }

    public void startCycle(){
        this.cycle.startWorkout();
        while(this.cycle.isWorkoutEnd() && !this.cycle.getBreakTime().isPeriodStart()) {
        if(this.cycle.isWorkoutEnd()&&!this.cycle.getBreakTime().isPeriodStart()){
            this.cycle.startBreak();
        }
        }
    }
}
