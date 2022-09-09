/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.Priority;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author Max
 */
public class APFactoryTest {
    
    APFactory factory = new APFactory();
    
    public APFactoryTest() {
    }

    /**
     * Test of createLocalDayPlan method, of class APFactory.
     */
    @Test
    public void testCreateLocalDayPlanDateTimeline() {
        // TODO review the generated test code and remove the default call to fail.
        assertThat(factory.createLocalDayPlan(LocalDay.now(), LocalTime.MIN, LocalTime.MIN)).isEqualTo(null);
    }

    /**
     * Test of createLocalDayPlan method, of class APFactory.
     */
    @Test
    public void testCreateLocalDayPlanStartEnd() {
        // TODO review the generated test code and remove the default call to fail.
        assertThat(factory.createLocalDayPlan(LocalDay.now(), LocalTime.MIN, LocalTime.MAX)).isEqualTo(null);
    }

    /**
     * Test of createAppointmentData method, of class APFactory.
     */
    @Test
    public void testCreateAppointmentData() {
        // TODO review the generated test code and remove the default call to fail.
        assertThat(factory.createAppointmentData("I want an appointment", Duration.ZERO)).isExactlyInstanceOf(AppointmentDataImp.class);
        assertThat(factory.createAppointmentData("I want an appointment", Duration.ZERO, Priority.LOW)).isExactlyInstanceOf(AppointmentDataImp.class);
    }

    /**
     * Test of createAppointmentRequest method, of class APFactory.
     */
    @Test
    public void testCreateAppointmentRequest() {
        // TODO review the generated test code and remove the default call to fail.
        AppointmentData appointment = factory.createAppointmentData("Appointment", Duration.ZERO);
        assertThat(factory.createAppointmentRequest(appointment, LocalTime.MIN)).isEqualTo(null);
    }

    /**
     * Test of between method, of class APFactory.
     */
    @Test
    public void testBetween() {
        // TODO review the generated test code and remove the default call to fail.
        assertThat(factory.between(Instant.MAX, Instant.MIN)).isEqualTo(null);
        assertThat(factory.between(LocalDay.now(), LocalTime.MIN, LocalTime.MAX)).isEqualTo(null);
    }
    
}
