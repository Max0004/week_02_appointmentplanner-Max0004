package appointmentplanner;

import appointmentplanner.api.AbstractAPFactory;
import appointmentplanner.api.LocalDay;
import appointmentplanner.api.LocalDayPlan;
import appointmentplanner.api.Priority;
import appointmentplanner.api.TimePreference;
import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
interface TestData {

    //static final AbstractAPFactory fac = GetFactory.getFactory();
    static final AbstractAPFactory fac = new MaxAPFactory();
    static final LocalDay TODAY = new LocalDay();
    static final LocalTime T08_30 = LocalTime.of( 8, 30 );
    static final LocalTime T09_00 = LocalTime.of( 9, 0 );
    static final LocalTime T09_30 = LocalTime.of( 9, 30 );
    static final LocalTime T10_00 = LocalTime.of( 10, 0 );
    static final LocalTime T10_30 = LocalTime.of( 10, 30 );
    static final LocalTime T10_45 = LocalTime.of( 10, 45 );
    static final LocalTime T11_10 = LocalTime.of( 11, 10 );
    static final LocalTime T14_30 = LocalTime.of( 14, 30 );
    static final LocalTime T15_00 = LocalTime.of( 15, 0 );
    static final LocalTime T15_15 = LocalTime.of( 15, 15 );
    static final LocalTime T15_45 = LocalTime.of( 15, 45 );
    static final LocalTime T16_00 = LocalTime.of( 16, 00 );
    static final LocalTime T17_30 = LocalTime.of( 17, 30 );

    static final Duration D15 = Duration.ofMinutes( 15 );
    static final Duration D30 = Duration.ofMinutes( 30 );
    static final Duration D80 = Duration.ofMinutes( 80 );
    static final Duration D90 = Duration.ofMinutes( 90 );
    static final Duration D200 = Duration.ofMinutes( 200 );

    static final MaxAppointmentData DATA1 = new MaxAppointmentData( "app1 30 min @9:00", D30, Priority.LOW );
    static final MaxAppointmentData DATA2 = new MaxAppointmentData( "app2 30 min @9:30", D30, Priority.LOW );
    static final MaxAppointmentData DATA3 = new MaxAppointmentData( "app3 15 min @10:30", D15, Priority.MEDIUM );
    static final MaxAppointmentData DATA4 = new MaxAppointmentData( "app4 15 min @10:45", D15, Priority.HIGH );
    static final MaxAppointmentData DATA5 = new MaxAppointmentData( "app5 200 min @11:10", D200, Priority.HIGH );
    static final MaxAppointmentData DATA6 = new MaxAppointmentData( "app6 30 min @14:30", D30, Priority.LOW );
    static final MaxAppointmentData DATA7 = new MaxAppointmentData( "app7 90 min @16:00", D90, Priority.LOW );

    static final MaxAppointmentRequest AR1 = new MaxAppointmentRequest( DATA1, T09_00, TimePreference.UNSPECIFIED );
    static final MaxAppointmentRequest AR2 = new MaxAppointmentRequest( DATA2, T09_30 );
    static final MaxAppointmentRequest AR3 = new MaxAppointmentRequest( DATA3, T10_30 );
    static final MaxAppointmentRequest AR4 = new MaxAppointmentRequest( DATA4, T10_45 );
    static final MaxAppointmentRequest AR5 = new MaxAppointmentRequest( DATA5, T11_10 );
    static final MaxAppointmentRequest AR6 = new MaxAppointmentRequest( DATA6, T14_30 );
    static final MaxAppointmentRequest AR7 = (MaxAppointmentRequest) fac.createAppointmentRequest( DATA7, T16_00, TimePreference.EARLIEST );

    static LocalDayPlan standardDay() {
        LocalDayPlan td = emptyWorkingDay();
        addApps( td, AR1, AR2, AR3, AR4, AR5, AR6, AR7 );
        return td;
    }

    static LocalDayPlan emptyWorkingDay() {
        return fac.createLocalDayPlan( TODAY, LocalTime.of( 8, 30 ), LocalTime.of( 17, 30 ) );
    }

    static LocalDayPlan addApps( LocalDayPlan dp, MaxAppointmentRequest... app ) {

        for ( MaxAppointmentRequest ar : app ) {
            ar.apply( fac, dp );
        }
        return dp;
    }

}