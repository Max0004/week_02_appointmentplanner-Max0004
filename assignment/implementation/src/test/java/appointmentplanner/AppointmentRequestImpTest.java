/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import java.time.Duration;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.SoftAssertions;

/**
 *
 * @author Max
 */
public class AppointmentRequestImpTest {
    
    APFactory factory = new APFactory();
    
    public AppointmentRequestImpTest() {
    }

    /**
     * Test of getStartTime method, of class AppointmentRequestImp.
     */
    @Test
    public void testGetStartTime() {
        // TODO review the generated test code and remove the default call to fail.
        LocalTime start = LocalTime.now();
        AppointmentData data = factory.createAppointmentData("Appointment", Duration.ofMinutes(95));
        AppointmentRequest request = factory.createAppointmentRequest(data, start);
        assertThat(request.getStartTime()).isEqualTo(start);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentData method, of class AppointmentRequestImp.
     */
    @Test
    public void testGetAppointmentData() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = factory.createAppointmentData("Appointment", Duration.ofMinutes(95));
        AppointmentRequest request = factory.createAppointmentRequest(data, LocalTime.now());
        assertThat(request.getAppointmentData()).isEqualTo(data);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimePreference method, of class AppointmentRequestImp.
     */
    @Test
    public void testGetTimePreference() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = factory.createAppointmentData("Appointment", Duration.ofMinutes(95));
        AppointmentRequest request = factory.createAppointmentRequest(data, LocalTime.now());
        assertThat(request.getTimePreference()).isEqualTo(request.getTimePreference());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class AppointmentRequestImp.
     */
    @Test
    public void testGetDescription() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = factory.createAppointmentData("Appointment", Duration.ofMinutes(95));
        AppointmentRequest request = factory.createAppointmentRequest(data, LocalTime.now());
        assertThat(request.getDescription()).isEqualTo("Appointment");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class AppointmentRequestImp.
     */
    @Test
    public void testGetPriority() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData data = factory.createAppointmentData("Appointment", Duration.ofMinutes(95));
        AppointmentRequest request = factory.createAppointmentRequest(data, LocalTime.now());
        assertThat(request.getPriority()).isEqualTo(Priority.LOW);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testHashCode() {
        AppointmentData data = factory.createAppointmentData("Appointment please", Duration.ofHours(2));
        AppointmentRequest request = factory.createAppointmentRequest(data, TimePreference.LATEST);
        AppointmentRequest requestEqual = factory.createAppointmentRequest(data, TimePreference.LATEST);
        AppointmentRequest requestNotEqual = factory.createAppointmentRequest(data, TimePreference.UNSPECIFIED);
        
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(request.hashCode()).isEqualTo(request.hashCode());
            softly.assertThat(request.hashCode()).isEqualTo(requestEqual.hashCode());
            softly.assertThat(request.hashCode()).isNotEqualTo(requestNotEqual.hashCode());
            softly.assertThat(requestEqual.hashCode()).isNotEqualTo(requestNotEqual.hashCode());
        });
    }
    
    @Test
    public void testEquals() {
        AppointmentData data = factory.createAppointmentData("Appointment please", Duration.ofHours(2));
        AppointmentRequest request = factory.createAppointmentRequest(data, TimePreference.LATEST);
        AppointmentRequest requestEqual = factory.createAppointmentRequest(data, TimePreference.LATEST);
        AppointmentRequest requestNotEqual = factory.createAppointmentRequest(data, TimePreference.UNSPECIFIED);
        AppointmentRequest requestNull = null;
        
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(request.equals(request)).isTrue();
            softly.assertThat(request.equals(requestEqual)).isTrue();
            softly.assertThat(request.equals(requestNotEqual)).isFalse();
            softly.assertThat(request.equals(requestNull)).isFalse();
        });
    }
}
