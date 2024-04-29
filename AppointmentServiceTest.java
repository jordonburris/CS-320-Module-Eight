package appointement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

class AppointmentServiceTest {
    private AppointmentService appointmentService;
    private Date validDate; 
    private Appointment validAppointment;

    @BeforeEach
    void setUp() {
        appointmentService = new AppointmentService(); // Initialize AppointmentService
        validDate = new Date(System.currentTimeMillis() + 3600000); // Set to valid date (1 hour from now)
        validAppointment = new Appointment("1234567890", validDate, "Valid description"); // Create valid appointment
    }

    @Test
    void testAddAppointment() {
        appointmentService.addAppointment(validAppointment);
        assertEquals(validAppointment, appointmentService.getAppointments().get("1234567890"));
    }

    @Test
    void testAddAppointmentDuplicateID() {
        appointmentService.addAppointment(validAppointment);

        assertThrows(IllegalArgumentException.class, () ->
                appointmentService.addAppointment(new Appointment("1234567890", validDate, "Duplicate ID")));
    }

    @Test
    void testAddAppointmentNullAppointment() {
        assertThrows(IllegalArgumentException.class, () -> appointmentService.addAppointment(null));
    }

    @Test
    void testAddAppointmentNullID() {
        assertThrows(IllegalArgumentException.class, () ->
                appointmentService.addAppointment(new Appointment(null, validDate, "Null ID")));
    }

    @Test
    void testDeleteAppointment() {
        appointmentService.addAppointment(validAppointment);
        appointmentService.deleteAppointment("1234567890");
        assertNull(appointmentService.getAppointments().get("1234567890"));
    }

    @Test
    void testDeleteNonexistentAppointment() {
        assertThrows(IllegalArgumentException.class, () -> appointmentService.deleteAppointment("NonexistentID"));
    }
}
