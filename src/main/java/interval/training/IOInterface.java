package interval.training;

import interval.training.models.TrainingTimer;

public interface IOInterface {

    public abstract void showTIme(TrainingTimer trainingTimer);

    public abstract void showStart();

    public abstract void showTrainingConfiguration();

    public abstract void showEditCycleConfiguration();
}
