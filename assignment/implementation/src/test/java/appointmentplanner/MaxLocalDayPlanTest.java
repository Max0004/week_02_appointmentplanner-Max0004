/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Timeline;
import java.time.Instant;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class MaxLocalDayPlanTest {

    AbstractAPFactory factory; 
    LocalDayPlan instance;

    public MaxLocalDayPlanTest() {
        factory = ServiceFinder.getFactory();
        instance = factory.createLocalDayPlan(LocalDay.now(), LocalTime.of(8, 0), LocalTime.of(17, 30));
    }

    /**
     * Test of getDay method, of class APLocalDayPlan.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        LocalDay expResult = LocalDay.now();
        LocalDay result = instance.getDay();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of earliest method, of class APLocalDayPlan.
     */
    @Test
    public void testEarliest() {
        System.out.println("earliest");
        Instant expResult = LocalDay.now().ofLocalTime(LocalTime.of(8, 0));
        Instant result = instance.earliest();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tooLate method, of class APLocalDayPlan.
     */
    @Test
    public void testTooLate() {
        System.out.println("tooLate");
        Instant expResult = LocalDay.now().ofLocalTime(LocalTime.of(17, 30));
        Instant result = instance.tooLate();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeline method, of class APLocalDayPlan.
     */
    @Test
    public void testGetTimeline() {
        System.out.println("getTimeline");
        Timeline expResult = new MaxTimeline(LocalDay.now().ofLocalTime(LocalTime.of(8, 0)), LocalDay.now().ofLocalTime(LocalTime.of(17, 30)));
        Timeline result = instance.getTimeline();
        assertEquals(expResult.start(), result.start());
        assertEquals(expResult.end(), result.end());
        //fail("The test case is a prototype.");
    }

}
