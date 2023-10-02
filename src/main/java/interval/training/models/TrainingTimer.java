package interval.training.models;

import java.util.logging.Logger;

public class TrainingTimer implements Runnable {
    private long seconds;

    public TrainingTimer(long seconds) {
        this.seconds = seconds;
    }

    Logger logger = Logger.getLogger(TrainingTimer.class.toString());

    public long getSeconds() {
        return seconds;
    }

    @Override
    public void run() {
        while (this.seconds >= 0) {
            try {
                Thread.sleep(1000);
                this.seconds--;
            }
            catch (Exception e){
                logger.info(e.getMessage());
            }
        }
    }
}
