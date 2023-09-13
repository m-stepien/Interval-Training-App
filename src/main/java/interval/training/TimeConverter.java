package interval.training;

import interval.training.models.Time;

public class TimeConverter {
    public static Time getTimeFromSeconds(int seconds){
        Time time = new Time();
        int minutes = seconds/60;
        int secondRest = seconds%60;
        return time;
    }
}
