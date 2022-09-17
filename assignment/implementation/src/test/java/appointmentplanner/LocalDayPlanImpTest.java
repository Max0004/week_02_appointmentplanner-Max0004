/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Timeline;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author max
 */
public class LocalDayPlanImpTest {
    
    APFactory factory = new APFactory();
    
    public LocalDayPlanImpTest() {
    }

    /**
     * Test of getDay method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetDay() {
        // TODO review the generated test code and remove the default call to fail.
        LocalDayPlan plan = factory.createLocalDayPlan(LocalDay.now(), Instant.parse("2018-01-01T07:30:12.00Z"), Instant.parse("2018-01-01T18:59:13.00Z"));
        assertThat(plan.getDay()).isEqualTo(LocalDay.now());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of earliest method, of class LocalDayPlanImp.
     */
    @Test
    public void testEarliest() {
        // TODO review the generated test code and remove the default call to fail.
        Instant earliest = Instant.parse("2018-01-01T07:30:12.00Z");
        LocalDayPlan plan = factory.createLocalDayPlan(LocalDay.now(), earliest, Instant.parse("2018-01-01T18:59:13.00Z"));
        assertThat(plan.earliest()).isEqualTo(earliest);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tooLate method, of class LocalDayPlanImp.
     */
    @Test
    public void testTooLate() {
        // TODO review the generated test code and remove the default call to fail.
        Instant tooLate = Instant.parse("2018-01-01T18:59:13.00Z");
        LocalDayPlan plan = factory.createLocalDayPlan(LocalDay.now(), Instant.parse("2018-01-01T07:30:12.00Z"), tooLate);
        assertThat(plan.tooLate()).isEqualTo(tooLate);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeline method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetTimeline() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline  = new TimelineImp(Instant.parse("2018-01-01T07:30:12.00Z"), Instant.parse("2018-01-01T18:59:13.00Z"));
        LocalDayPlan plan = factory.createLocalDayPlan(ZoneId.of("UTC"), LocalDate.MAX, timeline);
        assertThat(plan.getTimeline()).isEqualTo(timeline);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStartTime method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetStartTime() {
        // TODO review the generated test code and remove the default call to fail.
        LocalTime start = LocalTime.of(2, 30);
        LocalDayPlan plan = factory.createLocalDayPlan(LocalDay.now(), start, LocalTime.of(4, 30));
        assertThat(plan.getStartTime()).isEqualTo(start);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetEndTime() {
        // TODO review the generated test code and remove the default call to fail.
        LocalTime end = LocalTime.of(4, 30);
        LocalDayPlan plan = factory.createLocalDayPlan(LocalDay.now(), LocalTime.of(2, 30), end);
        assertThat(plan.getEndTime()).isEqualTo(end);
        //fail("The test case is a prototype.");
    }
    
}
