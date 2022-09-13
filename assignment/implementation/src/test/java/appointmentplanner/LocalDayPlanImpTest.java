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
 * @author Max
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
        LocalDayPlan ldplan = factory.createLocalDayPlan(LocalDay.now(), Instant.MIN, Instant.MAX);
        assertThat(ldplan.getDay()).isEqualTo(LocalDay.now());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of earliest method, of class LocalDayPlanImp.
     */
    @Test
    public void testEarliest() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        LocalDayPlan ldplan = factory.createLocalDayPlan(LocalDay.now(), Instant.MIN, Instant.MAX);
        assertThat(ldplan.earliest()).isEqualTo(timeline.start());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tooLate method, of class LocalDayPlanImp.
     */
    @Test
    public void testTooLate() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        LocalDayPlan ldplan = factory.createLocalDayPlan(LocalDay.now(), Instant.MIN, Instant.MAX);
        assertThat(ldplan.tooLate()).isEqualTo(timeline.end());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeline method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetTimeline() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        LocalDayPlan ldplan = factory.createLocalDayPlan(ZoneId.of("UTC"), LocalDate.MAX, timeline);
        assertThat(ldplan.getTimeline()).isEqualTo(timeline);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class LocalDayPlanImp.
     */
    @Test
    public void testGetEndTime() {
        // TODO review the generated test code and remove the default call to fail.
        LocalDayPlan localDayPlan = factory.createLocalDayPlan(LocalDay.now(), LocalTime.of(0, 0), LocalTime.of(23, 59));
        assertThat(localDayPlan.getEndTime()).isEqualTo(LocalTime.of(23, 59));
        //fail("The test case is a prototype.");
    }
    
}
