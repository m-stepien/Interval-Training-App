package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class Series {
    Timer timer = new Timer();
    private long timeInSec;

    public Series(long timeInSec) {
        this.timeInSec = timeInSec;
        timer.scheduleAtFixedRate(setTimer(), 0, 1000);
    }

    public long getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(long timeInSec) {
        this.timeInSec = timeInSec;
    }

    public TimerTask setTimer(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                setTimeInSec(getTimeInSec()-1);
                System.out.println(getTimeInSec());
                if(getTimeInSec()==0){
                    this.cancel();
                    System.out.println("enf");

                }
            }

        };
        return timerTask;
    }


}
