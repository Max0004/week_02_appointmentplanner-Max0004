package appointmentplanner;

import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Timeline;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author rolf
 */
public class MaxLocalDayPlan implements LocalDayPlan {

    private final LocalDay day;
    private final Timeline timeline;
    
    MaxLocalDayPlan(ZoneId zone, LocalDate date, Timeline timeline) {
        day = new LocalDay(zone, date);
        this.timeline = timeline;
        
    }

    MaxLocalDayPlan(LocalDay day, Instant start, Instant end) {
        this.day = day;
        timeline = new MaxTimeline(start, end);
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
}
