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
import org.assertj.core.api.SoftAssertions;

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
    
    @Test
    public void testHashCode() {
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ofHours(1));
        AppointmentData appointmentEquals = appointment;
        AppointmentData appointmentEqualsAgain = factory.createAppointmentData("Appointment", Duration.ofHours(1));
        AppointmentData appointmentNotEquals = factory.createAppointmentData("Appointment", Duration.ofHours(2));
        
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(appointment.hashCode()).isEqualTo(appointmentEquals.hashCode());
            softly.assertThat(appointment.hashCode()).isEqualTo(appointmentEqualsAgain.hashCode());
            softly.assertThat(appointmentEquals.hashCode()).isEqualTo(appointmentEqualsAgain.hashCode());
            softly.assertThat(appointment.hashCode()).isNotEqualTo(appointmentNotEquals.hashCode());
            softly.assertThat(appointmentEquals.hashCode()).isNotEqualTo(appointmentNotEquals.hashCode());
            softly.assertThat(appointmentEqualsAgain.hashCode()).isNotEqualTo(appointmentNotEquals.hashCode());
        });
    }
    
    @Test
    public void testEquals() {
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ofHours(2));
        AppointmentData appointmentDescNotEqual = factory.createAppointmentData("Hi", Duration.ofHours(2));
        AppointmentData appointmentDurationNotEqual = factory.createAppointmentData("Appointment", Duration.ofHours(3));
        AppointmentData appointmentNull = null;
        String appointmentString = "I want an appointmentplease";
        
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(appointment.equals(appointment)).isTrue();
            softly.assertThat(appointment.equals(appointmentNull)).isFalse();
            softly.assertThat(appointment.equals(appointmentString)).isFalse();
            softly.assertThat(appointment.equals(appointmentDescNotEqual)).isFalse();
            softly.assertThat(appointment.equals(appointmentDurationNotEqual)).isFalse();
        });
    }
}
