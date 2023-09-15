package interval.training.models;

import interval.training.TimePeriod;

public class Cycle {
    private TimePeriod workoutTime;
    private TimePeriod breakTime;

    public Cycle(long workoutTime, long breakTime) {
        this.workoutTime = new TimePeriod(workoutTime);
        this.breakTime = new TimePeriod(breakTime);
    }

    public TimePeriod getWorkoutTime() {
        return workoutTime;
    }

    public void setWorkoutTime(TimePeriod workoutTime) {
        this.workoutTime = workoutTime;
    }

    public TimePeriod getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(TimePeriod breakTime) {
        this.breakTime = breakTime;
    }

    public void startWorkout() {
        this.getWorkoutTime().startTimePeriod();
    }

    public void startBreak() {
        this.getBreakTime().startTimePeriod();
    }

    public boolean isWorkoutEnd() {
        return this.workoutTime.isPeriodEnd();
    }

    public boolean cycleEnd() {
        return this.isBreakEnd() && this.isWorkoutEnd();
    }

    public boolean isBreakEnd() {
        return this.breakTime.isPeriodEnd();
    }
}
