package interval.training;

import java.util.Timer;
import java.util.TimerTask;

public class TimePeriod {
    Timer timer = new Timer();
    private long timeInSec;

    private boolean isEndOfPeriod;

    private boolean isPeriodStarder;

    public TimePeriod(long timeInSec) {
        this.timeInSec = timeInSec;
        this.isEndOfPeriod = false;
        this.isPeriodStarder = false;
    }

    public void startTimePeriod() {
        timer.scheduleAtFixedRate(runTimer(), 0, 1000);
        this.isPeriodStarder = true;

    }

    public boolean isPeriodEnd() {
        return isEndOfPeriod;
    }

    public long getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(long timeInSec) {
        this.timeInSec = timeInSec;
    }

    public void setToDone() {
        this.isEndOfPeriod = true;
    }

    public TimerTask runTimer() {
        this.isPeriodStarder = true;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                setTimeInSec(getTimeInSec() - 1);
                System.out.println(getTimeInSec());
                if (getTimeInSec() == 0) {
                    setToDone();
                    this.cancel();

                }
            }

        };
        return timerTask;
    }

    public boolean isPeriodStart() {
        return this.isPeriodStarder;
    }

}
