/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.Priority;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author Max
 */
public class AppointmentDataImpTest {
    
    APFactory factory = new APFactory();
    
    public AppointmentDataImpTest() {
    }

    /**
     * Test of getDuration method, of class AppointmentDataImp.
     */
    @Test
    public void testGetDuration() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ofHours(1));
        assertThat(appointment.getDuration()).isEqualTo(Duration.ofHours(1));
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class AppointmentDataImp.
     */
    @Test
    public void testGetDescription() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ofHours(1));
        assertThat(appointment.getDescription()).isEqualTo("Appointment");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class AppointmentDataImp.
     */
    @Test
    public void testGetPriority() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ofHours(1), Priority.LOW);
        assertThat(appointment.getPriority()).isEqualTo(Priority.LOW);
        //fail("The test case is a prototype.");
    }
    
}
