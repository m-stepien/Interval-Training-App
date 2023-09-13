package org.example;

import java.util.HashMap;
import java.util.Map;

public class Training {
    private int numberOfSeries;

    //TODO to thing, use like this or make one map <numberOfCycle, Cycle>
    private HashMap<Integer, Integer> lenghtOfSeriesInSeconds;
    private HashMap<Integer, Integer> lenghtOfBreakInSeconds;

    private int lenghtOfPreWorkout;
    private int lenghtOfCoolDown;

    private int delay;
    public Training(int numberOfSeries, int standartLenghtOfSeries, int standartLenghtOfBreak,
    int lenghtOfPreWorkout, int lenghtOfCoolDown, int delay) {
        this.numberOfSeries = numberOfSeries;
        this.lenghtOfSeriesInSeconds = new HashMap<>();
        this.lenghtOfBreakInSeconds = new HashMap<>();
        this.initializeDefaultLenghtOfElement(this.lenghtOfBreakInSeconds, standartLenghtOfBreak);
        this.initializeDefaultLenghtOfElement(this.lenghtOfSeriesInSeconds, standartLenghtOfSeries);
        this.lenghtOfPreWorkout = lenghtOfPreWorkout;
        this.lenghtOfCoolDown = lenghtOfCoolDown;
        this.delay = delay;
    }

    public void setLenghtOfParticularBreak(Integer key, Integer newTimeQuantity) {
        setLenghtOfParticularTimeElement(this.lenghtOfBreakInSeconds, key, newTimeQuantity);
    }

    public int getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(int numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    public HashMap<Integer, Integer> getLenghtOfSeriesInSeconds() {
        return lenghtOfSeriesInSeconds;
    }

    public void setLenghtOfSeriesInSeconds(HashMap<Integer, Integer> lenghtOfSeriesInSeconds) {
        this.lenghtOfSeriesInSeconds = lenghtOfSeriesInSeconds;
    }

    public HashMap<Integer, Integer> getLenghtOfBreakInSeconds() {
        return lenghtOfBreakInSeconds;
    }

    public void setLenghtOfBreakInSeconds(HashMap<Integer, Integer> lenghtOfBreakInSeconds) {
        this.lenghtOfBreakInSeconds = lenghtOfBreakInSeconds;
    }

    public int getLenghtOfPreWorkout() {
        return lenghtOfPreWorkout;
    }

    public void setLenghtOfPreWorkout(int lenghtOfPreWorkout) {
        this.lenghtOfPreWorkout = lenghtOfPreWorkout;
    }

    public int getLenghtOfCoolDown() {
        return lenghtOfCoolDown;
    }

    public void setLenghtOfCoolDown(int lenghtOfCoolDown) {
        this.lenghtOfCoolDown = lenghtOfCoolDown;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void setLenghtOfParticularSeries(Integer key, Integer newTimeQuantity) {
        setLenghtOfParticularTimeElement(this.lenghtOfSeriesInSeconds, key, newTimeQuantity);
    }

    private void setLenghtOfParticularTimeElement(Map<Integer, Integer> mapOfElement, Integer key, Integer newTimeQuantity) {
        mapOfElement.replace(key, newTimeQuantity);
    }

    private void initializeDefaultLenghtOfElement(Map<Integer, Integer> timePeriodElements, Integer standartLenghtOfElement) {
        for (int i = 1; i < this.numberOfSeries; i++) {
            timePeriodElements.put(i, standartLenghtOfElement);
        }
    }
}
