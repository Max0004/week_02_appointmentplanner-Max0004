module appointmentplanner {
    requires appointmenplanner.api;
    provides appointmentplanner.api.AbstractAPFactory with appointmentplanner.MaxAPFactory;
    uses appointmentplanner.api.AbstractAPFactory; // in tests
}
