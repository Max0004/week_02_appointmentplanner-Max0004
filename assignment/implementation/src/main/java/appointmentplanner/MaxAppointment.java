/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.Priority;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author max
 */
public class MaxAppointment implements Appointment {

    private final AppointmentRequest appointmentRequest;
    private final AppointmentData appointmentData;
    private final Instant start;
    private final Instant end;

    public MaxAppointment(AppointmentRequest appointmentRequest, Instant start, Instant end) {
        this.appointmentRequest = appointmentRequest;
        this.start = start;
        this.end = end;
        appointmentData = new MaxAppointmentData(
                appointmentRequest.getDescription(),
                appointmentRequest.getDuration(),
                appointmentRequest.getPriority());
    }

    @Override
    public Priority getPriority() {
        return appointmentData.getPriority();
    }

    @Override
    public AppointmentData getAppointmentData() {
        return appointmentData;
    }

    @Override
    public AppointmentRequest getRequest() {
        return appointmentRequest;
    }

    @Override
    public Instant getStart() {
        return start;
    }

    @Override
    public Instant getEnd() {
        return end;
    }

    @Override
    public Duration getDuration() {
        return Duration.between(start, end);
    }

    @Override
    public String getDescription() {
        return appointmentData.getDescription();
    }
}
