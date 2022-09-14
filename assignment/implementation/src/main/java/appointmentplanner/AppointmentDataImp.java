/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.Priority;
import java.time.Duration;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.duration);
        hash = 79 * hash + Objects.hashCode(this.priority);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) {
            return true;
        }
        
        if(!(obj instanceof AppointmentDataImp)) {
            return false;
        }
        
        AppointmentData comparedData = (AppointmentData) obj;
        
        if(this.description.equals(comparedData.getDescription()) &&
                this.duration.equals(comparedData.getDuration()) &&
                this.priority == comparedData.getPriority()) {
            return true;
        }
        
        return false;
    }
}
