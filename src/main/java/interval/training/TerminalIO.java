package interval.training;

import interval.training.models.TrainingTimer;

public class TerminalIO implements IOInterface {

    @Override
    public void showStart() {
        System.out.println("Hello there training will begin");
    }

    @Override
    public void showTIme(TrainingTimer trainingTimer) {
        System.out.println(trainingTimer);
    }

    @Override
    public void showEditCycleConfiguration() {

    }

    @Override
    public void showTrainingConfiguration() {

    }


}
