/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class MaxAppointmentTest {

    AbstractAPFactory factory;
    Appointment instance;
    AppointmentData appointmentData;

    public MaxAppointmentTest() {
        factory = ServiceFinder.getFactory();
        appointmentData = factory.createAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW);
        LocalDayPlan localDayPlan = factory.createLocalDayPlan(LocalDay.now(), LocalTime.of(8, 0), LocalTime.of(17, 30));
        instance = localDayPlan.addAppointment(appointmentData, LocalTime.of(10, 15), TimePreference.EARLIEST).get();
    }

    /**
     * Test of getPriority method, of class APAppointment.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        Priority expResult = null;
        Priority result = instance.getPriority();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentData method, of class APAppointment.
     */
    @Test
    public void testGetAppointmentData() {
        System.out.println("getAppointmentData");
        AppointmentData expResult = null;
        AppointmentData result = instance.getAppointmentData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequest method, of class APAppointment.
     */
    @Test
    public void testGetRequest() {
        System.out.println("getRequest");
        AppointmentRequest expResult = null;
        AppointmentRequest result = instance.getRequest();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class APAppointment.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Instant expResult = null;
        Instant result = instance.getStart();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class APAppointment.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Instant expResult = null;
        Instant result = instance.getEnd();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class APAppointment.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Duration expResult = null;
        Duration result = instance.getDuration();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class APAppointment.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
