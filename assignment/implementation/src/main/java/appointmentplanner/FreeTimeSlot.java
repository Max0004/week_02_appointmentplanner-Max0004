/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.TimeSlot;
import java.time.Instant;

/**
 *
 * @author Rolf
 */
public class FreeTimeSlot implements TimeSlot {

    private Instant start;
    private Instant end;

    public FreeTimeSlot(Instant start, Instant end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Instant getStart() {
        return start;
    }

    @Override
    public Instant getEnd() {
        return end;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }
}
