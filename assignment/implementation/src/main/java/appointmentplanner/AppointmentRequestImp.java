/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author Max
 */
public class AppointmentRequestImp implements AppointmentRequest{

    private AppointmentData appData;
    private LocalTime prefStart;
    private TimePreference fallBack;
    
    AppointmentRequestImp(AppointmentData appData, LocalTime prefStart, TimePreference fallBack) {
        this.appData = appData;
        this.prefStart = prefStart;
        this.fallBack = fallBack;
    }

    @Override
    public LocalTime getStartTime() {
        return prefStart;
    }

    @Override
    public AppointmentData getAppointmentData() {
        return appData;
    }

    @Override
    public TimePreference getTimePreference() {
        return fallBack;
    }

    @Override
    public String getDescription() {
        return appData.getDescription();
    }

    @Override
    public Priority getPriority() {
        return appData.getPriority();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.appData);
        hash = 41 * hash + Objects.hashCode(this.prefStart);
        hash = 41 * hash + Objects.hashCode(this.fallBack);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AppointmentRequestImp other = (AppointmentRequestImp) obj;
//        if (!Objects.equals(this.appData, other.appData)) {
//            return false;
//        }
//        if (!Objects.equals(this.prefStart, other.prefStart)) {
//            return false;
//        }
        return (this.appData == other.appData && this.prefStart == other.prefStart && this.fallBack == other.fallBack);
    }
}
