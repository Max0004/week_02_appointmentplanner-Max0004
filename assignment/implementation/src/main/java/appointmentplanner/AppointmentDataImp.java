/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.Priority;
import java.time.Duration;

/**
 *
 * @author Max
 */
public class AppointmentDataImp implements AppointmentData{

    private String description;
    private Duration duration;
    private Priority priority;
    
    AppointmentDataImp(String description, Duration duration, Priority priority) {
        this.description = description;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }
}
