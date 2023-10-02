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
        Thread thread = new Thread(this.getWorkoutTime());
        thread.start();
    }

    public void startBreak() {
        this.getBreakTime().run();
    }

}
