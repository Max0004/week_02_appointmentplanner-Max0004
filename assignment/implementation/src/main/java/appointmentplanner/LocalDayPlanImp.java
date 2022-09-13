/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Timeline;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 *
 * @author Max
 */
public class LocalDayPlanImp implements LocalDayPlan {

    private LocalDay localDay;
    private Timeline timeline;
    private ZoneId zoneId;

    LocalDayPlanImp(ZoneId zone, LocalDate date, Timeline timeline) {
        localDay = new LocalDay(zone, date);
        this.timeline = timeline;
    }

    LocalDayPlanImp(LocalDay day, Instant start, Instant end) {
        localDay = day;
        timeline = new TimelineImp(start, end);
    }

    @Override
    public LocalDay getDay() {
        return localDay;
    }

    @Override
    public Instant earliest() {
        return timeline.start();
    }

    @Override
    public Instant tooLate() {
        return timeline.end();
    }

    @Override
    public Timeline getTimeline() {
        return timeline;
    }

    @Override
    public LocalTime getEndTime() {
        return localDay.timeOfInstant(timeline.end());
    }

}
