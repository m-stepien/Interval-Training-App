package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimePeriod {
    Timer timer = new Timer();
    private long timeInSec;

    private boolean isEndOfPeriod;
    public TimePeriod(long timeInSec) {
        this.timeInSec = timeInSec;
        this.isEndOfPeriod = false;
        timer.scheduleAtFixedRate(setTimer(), 0, 1000);
    }

    public long getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(long timeInSec) {
        this.timeInSec = timeInSec;
    }
    public void setToDone(){
        this.isEndOfPeriod = true;
    }

    public TimerTask setTimer(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                setTimeInSec(getTimeInSec()-1);
                System.out.println(getTimeInSec());
                if(getTimeInSec()==0){
                    this.cancel();
                    setToDone();
                }
            }

        };
        return timerTask;
    }


}
