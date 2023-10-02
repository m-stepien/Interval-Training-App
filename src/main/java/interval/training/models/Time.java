package interval.training.models;

import javax.swing.*;

public class Time {
    private int minutes;
    private int seconds;

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

    public String toString() {
        return String.join(":", Integer.valueOf(minutes).toString(), Integer.valueOf(seconds).toString());
    }
}
