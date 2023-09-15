package interval.training;

import interval.training.models.Time;

public class TerminalIO implements IOInterface {

    @Override
    public void showStart() {
        System.out.println("Hello there training will begin");
    }

    @Override
    public void showTIme(Time time) {
        System.out.println(time);
    }

    @Override
    public void showEditCycleConfiguration() {

    }

    @Override
    public void showTrainingConfiguration() {

    }


}
