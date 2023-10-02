package interval.training.models;

public class Cycle {
    private TrainingTimer workoutTime;
    private TrainingTimer breakTime;

    public Cycle(long workoutTime, long breakTime) {
        this.workoutTime = new TrainingTimer(workoutTime);
        this.breakTime = new TrainingTimer(breakTime);
    }

    public TrainingTimer getWorkoutTime() {
        return workoutTime;
    }

    public void setWorkoutTime(TrainingTimer workoutTime) {
        this.workoutTime = workoutTime;
    }

    public TrainingTimer getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(TrainingTimer breakTime) {
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
