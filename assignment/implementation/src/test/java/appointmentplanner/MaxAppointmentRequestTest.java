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
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class MaxAppointmentRequestTest {

    AbstractAPFactory factory;
    AppointmentRequest instance;
    AppointmentData appointmentData;

    public MaxAppointmentRequestTest() {
        factory = ServiceFinder.getFactory();
        appointmentData = factory.createAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW);
        instance = factory.createAppointmentRequest(appointmentData, TimePreference.EARLIEST);
    }

    /**
     * Test of getStartTime method, of class MaxAppointmentRequest.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        instance = factory.createAppointmentRequest(appointmentData, LocalTime.of(10, 15));
        LocalTime expResult = LocalTime.of(10, 15);
        LocalTime result = instance.getStartTime();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentData method, of class MaxAppointmentRequest.
     */
    @Test
    public void testGetAppointmentData() {
        System.out.println("getAppointmentData");
        AppointmentData expResult = new MaxAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW);
        AppointmentData result = instance.getAppointmentData();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimePreference method, of class MaxAppointmentRequest.
     */
    @Test
    public void testGetTimePreference() {
        System.out.println("getTimePreference");
        TimePreference expResult = TimePreference.EARLIEST;
        TimePreference result = instance.getTimePreference();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class MaxAppointmentRequest.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Testdata";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class MaxAppointmentRequest.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        Priority expResult = Priority.LOW;
        Priority result = instance.getPriority();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MaxAppointmentRequest.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = factory.createAppointmentRequest(appointmentData, LocalTime.of(10, 15)).hashCode();
        int result = instance.hashCode();
        assertNotEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MaxAppointmentRequest.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = factory.createAppointmentRequest(appointmentData, LocalTime.of(10, 15));
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apply method, of class MaxAppointmentRequest.
     */
    @Test
    public void testApply() {
        MaxAppointmentRequest apAppointmentRequest = (MaxAppointmentRequest) instance;

        System.out.println("apply");
        LocalDayPlan dp = factory.createLocalDayPlan(LocalDay.now(), LocalTime.of(8, 0), LocalTime.of(17, 30));
        Appointment result = apAppointmentRequest.apply(factory, dp);
        assertNotNull(result);
        //fail("The test case is a prototype.");
    }

}
