/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.TimePreference;
import appointmentplanner.api.TimeSlot;
import appointmentplanner.api.Timeline;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class MaxTimelineTest {

    Timeline instance;
    Instant startOfDayPlan = LocalDay.now().ofLocalTime(LocalTime.of(8, 0));
    Instant endOfDayPlan = LocalDay.now().ofLocalTime(LocalTime.of(16,30));

    public MaxTimelineTest() {
        instance = new MaxTimeline(startOfDayPlan, endOfDayPlan);
    }

    /**
     * Test of getNrOfAppointments method, of class MaxTimeline.
     */
    @Test
    public void testGetNrOfAppointments() {
        System.out.println("getNrOfAppointments");
        int expResult = 0;
        int result = instance.getNrOfAppointments();
        
        //MaxTimeline initially has one TimeSlot of Type FreeTimeSlot from 
        //startOfDayPlan (08:00) to endOfDayPlan (16:30).
        //ToDo: 
        //Add at least one Appointment (instance.addAppointment(...)) and assert 
        //that you get the expected number of Appointments.
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class MaxTimeline.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Instant expResult = startOfDayPlan;
        Instant result = instance.start();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of end method, of class MaxTimeline.
     */
    @Test
    public void testEnd() {
        System.out.println("end");
        Instant expResult = endOfDayPlan;
        Instant result = instance.end();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class MaxTimeline.
     */
    @Test
    public void testAddAppointment_3args_1() {
        System.out.println("addAppointment");
        LocalDay forDay = null;
        AppointmentData appointment = null;
        TimePreference timepreference = null;
        Optional<Appointment> expResult = null;
        Optional<Appointment> result = instance.addAppointment(forDay, appointment, timepreference);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class MaxTimeline.
     */
    @Test
    public void testAddAppointment_3args_2() {
        System.out.println("addAppointment");
        LocalDay forDay = null;
        AppointmentData appointment = null;
        LocalTime startTime = null;
        Optional<Appointment> expResult = null;
        Optional<Appointment> result = instance.addAppointment(forDay, appointment, startTime);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class MaxTimeline.
     */
    @Test
    public void testAddAppointment_4args() {
        System.out.println("addAppointment");
        LocalDay forDay = null;
        AppointmentData appointment = null;
        LocalTime startTime = null;
        TimePreference fallback = null;
        Optional<Appointment> expResult = null;
        Optional<Appointment> result = instance.addAppointment(forDay, appointment, startTime, fallback);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAppointment method, of class MaxTimeline.
     */
    @Test
    public void testRemoveAppointment() {
        System.out.println("removeAppointment");
        Appointment appointment = null;
        AppointmentRequest expResult = null;
        AppointmentRequest result = instance.removeAppointment(appointment);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAppointments method, of class MaxTimeline.
     */
    @Test
    public void testRemoveAppointments() {
        System.out.println("removeAppointments");
        Predicate<Appointment> filter = null;
        List<AppointmentRequest> expResult = null;
        List<AppointmentRequest> result = instance.removeAppointments(filter);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAppointments method, of class MaxTimeline.
     */
    @Test
    public void testFindAppointments() {
        System.out.println("findAppointments");
        Predicate<Appointment> filter = null;
        List<Appointment> expResult = null;
        List<Appointment> result = instance.findAppointments(filter);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of appointmentStream method, of class MaxTimeline.
     */
    @Test
    public void testAppointmentStream() {
        System.out.println("appointmentStream");
        Stream<Appointment> result = instance.appointmentStream();

        //result must always be a valid list
        assertNotNull(result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class MaxTimeline.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Appointment appointment = null;
        boolean expResult = false;
        boolean result = instance.contains(appointment);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFitting method, of class MaxTimeline.
     */
    @Test
    public void testGetGapsFitting() {
        System.out.println("getGapsFitting");
        Duration duration = Duration.ofMinutes(30);
        List<TimeSlot> result = instance.getGapsFitting(duration);
        
        //result must always be a valid list
        assertNotNull(result);
        
        //MaxTimeline initially has one TimeSlot of Type FreeTimeSlot from 
        //startOfDayPlan (08:00) to endOfDayPlan (16:30).
        assertEquals(result.size(), 1);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canAddAppointmentOfDuration method, of class MaxTimeline.
     */
    @Test
    public void testCanAddAppointmentOfDuration() {
        System.out.println("canAddAppointmentOfDuration");
        Duration duration = null;
        boolean expResult = false;
        boolean result = instance.canAddAppointmentOfDuration(duration);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingReversed method, of class MaxTimeline.
     */
    @Test
    public void testGetGapsFittingReversed() {
        System.out.println("getGapsFittingReversed");
        Duration duration = null;
        List<TimeSlot> expResult = null;
        List<TimeSlot> result = instance.getGapsFittingReversed(duration);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingSmallestFirst method, of class MaxTimeline.
     */
    @Test
    public void testGetGapsFittingSmallestFirst() {
        System.out.println("getGapsFittingSmallestFirst");
        Duration duration = null;
        List<TimeSlot> expResult = null;
        List<TimeSlot> result = instance.getGapsFittingSmallestFirst(duration);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGapsFittingLargestFirst method, of class MaxTimeline.
     */
    @Test
    public void testGetGapsFittingLargestFirst() {
        System.out.println("getGapsFittingLargestFirst");
        Duration duration = null;
        List<TimeSlot> expResult = null;
        List<TimeSlot> result = instance.getGapsFittingLargestFirst(duration);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatchingFreeSlotsOfDuration method, of class MaxTimeline.
     */
    @Test
    public void testGetMatchingFreeSlotsOfDuration() {
        System.out.println("getMatchingFreeSlotsOfDuration");
        Duration minLength = null;
        List<Timeline> other = null;
        List<TimeSlot> expResult = null;
        List<TimeSlot> result = instance.getMatchingFreeSlotsOfDuration(minLength, other);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
