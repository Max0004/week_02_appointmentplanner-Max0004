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

    private final TimeSlot timeSlot;
    private AllocationNode prev;
    private AllocationNode next;

    /**
     * Node for a doubly linked list with TimeSlot objects
     * @param timeSlot the data for this node
     * @param prevNode if present, the previous node, otherwise null
     * @param nextNode if present, the next node, otherwise null
     * 
     * @exception IllegalArgumentException is thrown, when timeSlot is null
     */
    public AllocationNode(TimeSlot timeSlot, AllocationNode prevNode, AllocationNode nextNode) {
        if (null == timeSlot) {
            throw new IllegalArgumentException(TimeSlot.class.getTypeName() + "must not be null!");
        }
        
        this.timeSlot = timeSlot;
        this.prev = prevNode;
        this.next = nextNode;
    }

    /**
     * Returns the Data in this node
     * @return
     */
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    /**
     * Returns the previous node
     * @return
     */
    public AllocationNode getPrev() {
        return prev;
    }

    /**
     * Sets the previous node to the new Value.
     * In case of TimeSlot is a FreeTimeSlot, start of TimeSlot is set to the
     * end of the previous node.
     * @param prev
     */
    public void setPrev(AllocationNode prev) {
        this.prev = prev;

        if (timeSlot instanceof FreeTimeSlot) {
            if (null != this.prev) {
                ((FreeTimeSlot) this.getTimeSlot()).setStart(prev.getEnd());
            }
        }
    }

    /**
     * Returns the next node
     * @return
     */
    public AllocationNode getNext() {
        return next;
    }

    /**
     * Sets the next node to the new Value.
     * In case of TimeSlot is a FreeTimeSlot, end of TimeSlot is set to the
     * start of the next node.
     * @param next 
     */
    public void setNext(AllocationNode next) {
        this.next = next;

        if (timeSlot instanceof FreeTimeSlot) {
            if (null != this.next) {
                ((FreeTimeSlot) this.getTimeSlot()).setEnd(next.getStart());
            }
        }
    }

    /**
     * Returns start of TimeSlot
     * @return
     */
    public Instant getStart() {
        return timeSlot.getStart();
    }

    /**
     * Returns end of TimeSlot
     * @return
     */
    public Instant getEnd() {
        return timeSlot.getEnd();
    }
}
