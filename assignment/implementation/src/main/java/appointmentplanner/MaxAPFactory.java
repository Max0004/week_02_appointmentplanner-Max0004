package appointmentplanner;

/*
 * Copyright (c) 2019 Informatics Fontys FHTenL University ofLength Applied Science Venlo
 */
import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import appointmentplanner.api.TimeSlot;
import appointmentplanner.api.Timeline;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Abstract factory to separate student implementations from teachers tests. The
 * instance created by this factory will be black-box tested by the teachers
 * tests.
 *
 * Richard van den Ham {@code r.vandenham@fontys.nl} Pieter van den Hombergh
 * {@code p.vandenhombergh@fontys.nl}
 */
public class MaxAPFactory implements AbstractAPFactory {

    public MaxAPFactory() {
    }
    
    @Override
    public LocalDayPlan createLocalDayPlan( ZoneId zone, LocalDate date, Timeline timeline ) {
        //TODO Return an instance of your class that implements LocalDayPlan
        return new MaxLocalDayPlan(zone,date,timeline);
    }

    @Override
    public LocalDayPlan createLocalDayPlan( LocalDay day, Instant start, Instant end ) {
        //TODO Return an instance of your class that implements LocalDayPlan
        return new MaxLocalDayPlan(day,start,end);
    }

    @Override
    public AppointmentData createAppointmentData( String description, Duration duration, Priority priority ) {
        //TODO Return an instance of your class that implements AppointmentData
        return new MaxAppointmentData(description,duration,priority);
    }

    @Override
    public AppointmentRequest createAppointmentRequest( AppointmentData appData, LocalTime prefStart, TimePreference fallBack ) {
        //TODO Return an instance of your class that implements AppointmentRequest
        return new MaxAppointmentRequest(appData,prefStart,fallBack);
    }

    @Override
    public TimeSlot between( Instant start, Instant end ) {
        //TODO Return an instance of your class that implements TimeSlot
        return null;
    }
}
