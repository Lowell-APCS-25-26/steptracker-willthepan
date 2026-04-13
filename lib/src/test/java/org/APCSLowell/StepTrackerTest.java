package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

public class StepTrackerTest {
    @Test
    public void parta() {
        StepTracker tr = new StepTracker(10000);
        assertEquals(0, tr.activeDays());
        assertEquals(0, tr.averageSteps(), 0.01);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        assertEquals(0, tr.activeDays());
        assertEquals(7000, tr.averageSteps(), 0.01);
        tr.addDailySteps(13000);
        assertEquals(1, tr.activeDays());
        assertEquals(9000, tr.averageSteps(), 0.01);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        assertEquals(2, tr.activeDays());
        assertEquals(10222.2, tr.averageSteps(), 0.01);
    }
}
