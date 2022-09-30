/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;

/**
 *
 * @author Max
 */
public class MaxAppointmentRequest implements AppointmentRequest, BiFunction<AbstractAPFactory, LocalDayPlan, Appointment> {

    private final AppointmentData appointmentData;
    private final LocalTime preferredStart;
    private final TimePreference timePreference;

    MaxAppointmentRequest(AppointmentData appData, LocalTime prefStart) {
        this.appointmentData = appData;
        this.preferredStart = prefStart;
        this.timePreference = TimePreference.EARLIEST;
    }

    MaxAppointmentRequest(AppointmentData appData, LocalTime prefStart, TimePreference timePreference) {
        this.appointmentData = appData;
        this.preferredStart = prefStart;
        this.timePreference = timePreference;
    }

    @Override
    public LocalTime getStartTime() {
        return preferredStart;
    }

    @Override
    public AppointmentData getAppointmentData() {
        return appointmentData;
    }

    @Override
    public TimePreference getTimePreference() {
        return timePreference == null ? AppointmentRequest.super.getTimePreference() : timePreference;
    }

    @Override
    public String getDescription() {
        return appointmentData.getDescription();
    }

    @Override
    public Priority getPriority() {
        return appointmentData.getPriority();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.appointmentData);
        hash = 41 * hash + Objects.hashCode(this.preferredStart);
        hash = 41 * hash + Objects.hashCode(this.timePreference);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MaxAppointmentRequest)) {
            return false;
        }

        AppointmentRequest comparedRequest = (AppointmentRequest) obj;

        if (this.appointmentData == comparedRequest.getAppointmentData()
                && this.timePreference.equals(comparedRequest.getTimePreference())
                && this.preferredStart.equals(comparedRequest.getStartTime())) {
            return true;
        }

        return false;
    }

    @Override
    public Appointment apply(AbstractAPFactory af, LocalDayPlan dp) {
        Optional<Appointment> app = Optional.empty();

        if (null == preferredStart) {
            app = dp.addAppointment(
                    af.createAppointmentData(appointmentData.getDescription(),
                            appointmentData.getDuration()),
                    getStartTime());
        }
        if (!app.isPresent()) {
            app = dp.addAppointment(
                    af.createAppointmentData(appointmentData.getDescription(),
                            appointmentData.getDuration()),
                    getTimePreference());
        }
        return app.isPresent() ? app.get() : null;
    }
}
