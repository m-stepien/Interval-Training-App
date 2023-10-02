package interval.training;

import interval.training.models.Cycle;

import java.util.List;

public class CycleManager {
    private List<Cycle> cycleList;
    //builder najprawdppodpbniej sie tu sprawdzo
    public CycleManager(List<Cycle> cycle) {
        this.cycleList = cycle;
    }

    public void startCycle(int i) {
        this.cycleList.get(i).startWorkout();
    }
}
