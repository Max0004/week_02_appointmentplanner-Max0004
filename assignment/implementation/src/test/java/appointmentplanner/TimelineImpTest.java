/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import appointmentplanner.api.Timeline;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author Max
 */
public class TimelineImpTest {
    
    public TimelineImpTest() {
    }

    /**
     * Test of getNrOfAppointments method, of class TimelineImp.
     */
    @Test
    public void testGetNrOfAppointments() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getNrOfAppointments()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class TimelineImp.
     */
    @Test
    public void testStart() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThat(timeline.start()).isEqualTo(Instant.MIN);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of end method, of class TimelineImp.
     */
    @Test
    public void testEnd() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThat(timeline.end()).isEqualTo(Instant.MAX);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class TimelineImp.
     */
    @Test
    public void testAddAppointmentThreeArgumentsWithStartTime() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = new AppointmentDataImp("Appointment", Duration.ZERO, Priority.LOW);
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.addAppointment(LocalDay.now(), data, LocalTime.MIN)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class TimelineImp.
     */
    @Test
    public void testAddAppointmentThreeArgumentsWithTimePreference() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = new AppointmentDataImp("Appointment", Duration.ZERO, Priority.LOW);
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.addAppointment(LocalDay.now(), data, TimePreference.EARLIEST)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class TimelineImp.
     */
    @Test
    public void testAddAppointmentFourArguments() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = new AppointmentDataImp("Appointment", Duration.ZERO, Priority.LOW);
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.addAppointment(LocalDay.now(), data, LocalTime.MIN, TimePreference.EARLIEST)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeAppointment method, of class TimelineImp.
     */
    @Test
    public void testRemoveAppointmentWithAppointmentObject() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.removeAppointment(appointment)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeAppointments method, of class TimelineImp.
     */
    @Test
    public void testRemoveAppointments() {
        // TODO review the generated test code and remove the default call to fail.
        Predicate<Appointment> filter = appointment -> (appointment.equals(Instant.MIN));
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.removeAppointments(filter)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findAppointments method, of class TimelineImp.
     */
    @Test
    public void testFindAppointments() {
        // TODO review the generated test code and remove the default call to fail.
        Predicate<Appointment> filter = appointment -> (appointment.equals(Instant.MIN));
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.findAppointments(filter)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of appointmentStream method, of class TimelineImp.
     */
    @Test
    public void testAppointmentStream() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.appointmentStream()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class TimelineImp.
     */
    @Test
    public void testContains() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.contains(appointment)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFitting method, of class TimelineImp.
     */
    @Test
    public void testGetGapsFitting() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getGapsFitting(Duration.ZERO)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canAddAppointmentOfDuration method, of class TimelineImp.
     */
    @Test
    public void testCanAddAppointmentOfDuration() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.canAddAppointmentOfDuration(Duration.ZERO)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingReversed method, of class TimelineImp.
     */
    @Test
    public void testGetGapsFittingReversed() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getGapsFittingReversed(Duration.ZERO)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingSmallestFirst method, of class TimelineImp.
     */
    @Test
    public void testGetGapsFittingSmallestFirst() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getGapsFittingSmallestFirst(Duration.ZERO)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingLargestFirst method, of class TimelineImp.
     */
    @Test
    public void testGetGapsFittingLargestFirst() {
        // TODO review the generated test code and remove the default call to fail.
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getGapsFittingLargestFirst(Duration.ZERO)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMatchingFreeSlotsOfDuration method, of class TimelineImp.
     */
    @Test
    public void testGetMatchingFreeSlotsOfDuration() {
        // TODO review the generated test code and remove the default call to fail.
        List<Timeline> other = new ArrayList<>();
        Timeline timeline = new TimelineImp(Instant.MIN, Instant.MAX);
        assertThatThrownBy(()->timeline.getMatchingFreeSlotsOfDuration(Duration.ZERO, other)).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }
    
}
