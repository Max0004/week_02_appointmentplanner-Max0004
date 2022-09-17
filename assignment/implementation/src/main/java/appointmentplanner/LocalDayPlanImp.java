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
 * @author max
 */
public class LocalDayPlanImp implements LocalDayPlan {

    private LocalDay day;
    private Timeline timeline;
    
    LocalDayPlanImp(ZoneId zone, LocalDate date, Timeline timeline) {
        day = new LocalDay(zone, date);
        this.timeline = timeline;
        
    }

    LocalDayPlanImp(LocalDay day, Instant start, Instant end) {
        this.day = day;
        timeline = new TimelineImp(start, end);
    }

    @Override
    public LocalDay getDay() {
        return day;
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
    public LocalTime getStartTime() {
        return LocalDayPlan.super.getStartTime(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public LocalTime getEndTime() {
        return LocalDayPlan.super.getEndTime(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
