package interval.training;

import interval.training.models.Cycle;

import java.util.HashMap;

public class Training {
    private int numberOfSeries;

    private HashMap<Integer, Cycle> cycleMap;

    private int lenghtOfPreWorkout;
    private int lenghtOfCoolDown;

    private int lenghtOfWorkout;
    private int lenghtOfBreak;
    private int delay;

    public Training(int numberOfSeries, int lenghtOfWorkout, int lenghtOfBreak,
                    int lenghtOfPreWorkout, int lenghtOfCoolDown, int delay) {
        this.numberOfSeries = numberOfSeries;
        this.lenghtOfPreWorkout = lenghtOfPreWorkout;
        this.lenghtOfCoolDown = lenghtOfCoolDown;
        this.delay = delay;
        fillCycleMap();
    }

    public Cycle getCycle(int key){
        return this.cycleMap.get(key);
    }

    public void fillCycleMap() {
        for (int i = 0; i < this.numberOfSeries; i++) {
            this.cycleMap.put(i, new Cycle(this.lenghtOfWorkout, this.lenghtOfBreak));
        }
    }
}
