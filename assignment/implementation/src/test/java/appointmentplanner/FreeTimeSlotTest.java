/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.LocalDay;
import java.time.Instant;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rolf
 */
public class FreeTimeSlotTest {

    FreeTimeSlot instance;

    public FreeTimeSlotTest() {
        instance = new FreeTimeSlot(LocalDay.now().ofLocalTime(LocalTime.of(10, 45)), LocalDay.now().ofLocalTime(LocalTime.of(10, 15)));
    }

    /**
     * Test of getStart method, of class FreeTimeSlot.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Instant expResult = LocalDay.now().ofLocalTime(LocalTime.of(10, 45));
        Instant result = instance.getStart();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class FreeTimeSlot.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Instant expResult = LocalDay.now().ofLocalTime(LocalTime.of(10, 15));
        Instant result = instance.getEnd();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
