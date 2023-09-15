package interval.training;

import interval.training.models.Cycle;

public class CycleManager {
    private Cycle cycle;

    public CycleManager(Cycle cycle) {
        this.cycle = cycle;
    }

    public void startCycle() {
        this.cycle.startWorkout();

        while (!this.cycle.isWorkoutEnd() || !this.cycle.isBreakEnd()) {
            if (this.cycle.isWorkoutEnd() && !this.cycle.getBreakTime().isPeriodStart()) {
                System.out.println("wcho");
                this.cycle.startBreak();
            }
            if (cycle.cycleEnd()) {
                System.out.println("koniec");
            }
        }

    }
}
