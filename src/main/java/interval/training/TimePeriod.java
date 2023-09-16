package interval.training;

import java.util.Timer;
import java.util.TimerTask;

public class TimePeriod extends Thread{
    Timer timer = new Timer();
    private long timeInSec;

    private boolean isEndOfPeriod;

    private boolean isPeriodStarder;
    private TimerTask timerTask;

    public TimerTask getTimerTask() {
        return timerTask;
    }

    public void setTimerTask(TimerTask timerTask) {
        this.timerTask = timerTask;
    }

    public TimePeriod(long timeInSec) {
        this.timeInSec = timeInSec;
        this.isEndOfPeriod = false;
        this.isPeriodStarder = false;
    }

    public void startTimePeriod() {
        this.isPeriodStarder = true;
        timer.scheduleAtFixedRate(runTimer(), 0, 1000);

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
                if(getTimeInSec()==0){
                    setToDone();
                    this.cancel();
                }
                System.out.println(getTimeInSec());
                setTimeInSec(getTimeInSec() - 1);
            }

        };
        this.timerTask = timerTask;
        return timerTask;
    }

    public boolean isPeriodStart() {
        return this.isPeriodStarder;
    }

}
