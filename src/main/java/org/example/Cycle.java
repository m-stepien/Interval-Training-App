package org.example;

import java.util.List;

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
}
