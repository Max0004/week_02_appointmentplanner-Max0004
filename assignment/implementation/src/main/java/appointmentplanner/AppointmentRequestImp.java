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
}
