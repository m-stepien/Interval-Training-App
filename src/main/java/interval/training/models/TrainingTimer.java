package interval.training.models;

import java.util.logging.Logger;

public class TrainingTimer implements Runnable {
    private int minutes;
    private int seconds;

    public TrainingTimer(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Logger logger = Logger.getLogger(TrainingTimer.class.toString());

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        while (this.seconds >= 0) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                logger.info(e.getMessage());
            }
            this.seconds--;
            if(this.seconds<0&&this.minutes!=0){
                this.minutes--;
                this.seconds=59;
            }
        }
    }

    public String toString() {
        return String.join(":", Integer.valueOf(minutes).toString(), Integer.valueOf(seconds).toString());
    }
}
