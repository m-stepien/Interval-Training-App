package interval.training;

import interval.training.models.Time;

public interface IOInterface {

    public abstract void showTIme(Time time);

    public abstract void showStart();

    public abstract void showTrainingConfiguration();

    public abstract void showEditCycleConfiguration();
}
