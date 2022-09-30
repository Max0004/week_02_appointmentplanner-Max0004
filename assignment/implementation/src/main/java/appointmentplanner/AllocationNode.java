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
public class AllocationNode {

    private TimeSlot timeSlot;
    private AllocationNode prev;
    private AllocationNode next;

    public AllocationNode(TimeSlot timeSlot, AllocationNode prevNode, AllocationNode nextNode) {
        this.timeSlot = timeSlot;
        this.prev = prevNode;
        this.next = nextNode;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public AllocationNode getPrev() {
        return prev;
    }

    public void setPrev(AllocationNode prev) {
        this.prev = prev;
    }

    public AllocationNode getNext() {
        return next;
    }

    public void setNext(AllocationNode next) {
        this.next = next;
    }
    
    public Instant start(){
        return timeSlot.getStart();
    }

    public Instant end(){
        return timeSlot.getEnd();
    }
}
