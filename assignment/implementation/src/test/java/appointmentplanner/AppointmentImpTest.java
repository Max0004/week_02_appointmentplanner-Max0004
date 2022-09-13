/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.Appointment;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author max
 */
public class AppointmentImpTest {
    
    public AppointmentImpTest() {
    }

    /**
     * Test of getPriority method, of class AppointmentImp.
     */
    @Test
    public void testGetPriority() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getPriority()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentData method, of class AppointmentImp.
     */
    @Test
    public void testGetAppointmentData() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getAppointmentData()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRequest method, of class AppointmentImp.
     */
    @Test
    public void testGetRequest() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getRequest()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class AppointmentImp.
     */
    @Test
    public void testGetStart() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getStart()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class AppointmentImp.
     */
    @Test
    public void testGetEnd() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getEnd()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class AppointmentImp.
     */
    @Test
    public void testGetDuration() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getDuration()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class AppointmentImp.
     */
    @Test
    public void testGetDescription() {
        // TODO review the generated test code and remove the default call to fail.
        Appointment appointment = new AppointmentImp();
        assertThatThrownBy(() -> appointment.getDescription()).isExactlyInstanceOf(UnsupportedOperationException.class);
        //fail("The test case is a prototype.");
    }
    
}
