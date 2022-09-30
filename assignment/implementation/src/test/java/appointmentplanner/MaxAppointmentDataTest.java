/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.Priority;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class MaxAppointmentDataTest {
    AbstractAPFactory factory; 
    AppointmentData instance;

    public MaxAppointmentDataTest() {
        factory = ServiceFinder.getFactory();
        instance = factory.createAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW);
    }

    /**
     * Test of getDuration method, of class MaxAppointmentData.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Duration expResult = Duration.ofMinutes(30);
        Duration result = instance.getDuration();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class MaxAppointmentData.
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
     * Test of getPriority method, of class MaxAppointmentData.
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
     * Test of hashCode method, of class MaxAppointmentData.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = new MaxAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW).hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MaxAppointmentData.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new MaxAppointmentData("Testdata", Duration.ofMinutes(30), Priority.LOW);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
}
