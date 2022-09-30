/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointmentplanner;

import appointmentplanner.api.Appointment;
import appointmentplanner.api.AppointmentData;
import appointmentplanner.api.AppointmentRequest;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.TimePreference;
import appointmentplanner.api.TimeSlot;
import appointmentplanner.api.Timeline;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import static java.util.Spliterator.ORDERED;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 *
 * @author Rolf
 */
public class MaxTimeline implements Timeline, Iterable<TimeSlot> {

    private final Instant start;
    private final Instant end;
    private final AllocationNode head;

    MaxTimeline(Instant start, Instant end) {
        this.start = start;
        this.end = end;

        head = new AllocationNode(new FreeTimeSlot(this.start, this.end), null, null);
    }

    @Override
    public int getNrOfAppointments() {
        return (int) appointmentStream().count();
    }

    @Override
    public Instant start() {
        return start;
    }

    @Override
    public Instant end() {
        return end;
    }

    @Override
    public Optional<Appointment> addAppointment(LocalDay forDay, AppointmentData appointment, TimePreference timepreference) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Appointment> addAppointment(LocalDay forDay, AppointmentData appointment, LocalTime startTime) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Appointment> addAppointment(LocalDay forDay, AppointmentData appointment, LocalTime startTime, TimePreference fallback) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AppointmentRequest removeAppointment(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AppointmentRequest> removeAppointments(Predicate<Appointment> filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Appointment> findAppointments(Predicate<Appointment> filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Stream<Appointment> appointmentStream() {
        return stream()
                .filter(e -> e instanceof MaxAppointment).map(e -> (Appointment) e);
    }

    @Override
    public boolean contains(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TimeSlot> getGapsFitting(Duration duration) {
        return stream()
                .filter(e -> (e instanceof FreeTimeSlot) && (e.duration().toMinutes() >= duration.toMinutes()))
                .map(e -> e)
                .toList();
    }

    @Override
    public boolean canAddAppointmentOfDuration(Duration duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TimeSlot> getGapsFittingReversed(Duration duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TimeSlot> getGapsFittingSmallestFirst(Duration duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TimeSlot> getGapsFittingLargestFirst(Duration duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TimeSlot> getMatchingFreeSlotsOfDuration(Duration minLength, List<Timeline> other) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterator<TimeSlot> iterator() {
        Iterator<TimeSlot> iterator = new Iterator<TimeSlot>() {

            private AllocationNode currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public TimeSlot next() {
                TimeSlot returnValue = currentNode.getTimeSlot();
                currentNode = currentNode.getNext();
                return returnValue;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }

    Stream<TimeSlot> stream() {
        Spliterator<TimeSlot> spliterator = Spliterators.spliteratorUnknownSize(iterator(), ORDERED);
        return StreamSupport.stream(spliterator, false);
    }
}
