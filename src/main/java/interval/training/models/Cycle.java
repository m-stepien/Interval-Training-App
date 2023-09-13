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

    public void startWorkout(){
        this.getWorkoutTime().runTimer();
    }
    public void startBreak(){
        this.getBreakTime().runTimer();
    }

    public boolean isWorkoutEnd(){
        return this.workoutTime.isPeriodEnd();
    }

    public boolean isBreakEnd(){
        return this.workoutTime.isPeriodEnd();
    }
}
