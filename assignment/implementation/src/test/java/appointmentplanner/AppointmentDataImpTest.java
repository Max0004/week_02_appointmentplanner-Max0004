package appointmentplanner;

import java.time.Duration;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

import appointmentplanner.api.AppointmentData;

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
        AppointmentData appointment = factory.createAppointmentData("I want an appointment", Duration.ZERO);
        assertThatThrownBy(() -> appointment.getDuration()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    /**
     * Test of getDescription method, of class AppointmentDataImp.
     */
    @Test
    public void testGetDescription() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("I want an appointment", Duration.ZERO);
        assertThatThrownBy(() -> appointment.getDescription()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    /**
     * Test of getPriority method, of class AppointmentDataImp.
     */
    @Test
    public void testGetPriority() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("I want an appointment", Duration.ZERO);
        assertThatThrownBy(() -> appointment.getPriority()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }
    
}
