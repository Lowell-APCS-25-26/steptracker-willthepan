package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int dayCount;
    private int activeDays;


    public StepTracker(int activityThreshold) {
        this.minSteps = activityThreshold;
        totalSteps = 0;
        dayCount = 0;
        activeDays=0;
    
    }
    void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        dayCount++;
        if(stepCount >= minSteps){
            activeDays++;
        }
    }
    int activeDays() {
        return activeDays;
    }
    double averageSteps() {
        if(dayCount==0){
            return 0; 
        }
        return (double)totalSteps/dayCount;
    }
}
