package appointement;

import static org.junit.jupiter.api.Assertions.*;\
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {
    private String description;
    private String tooLongID;
    private String tooLongDescription;
    private Date date;
    private Date pastDate;

    @BeforeEach
    void setUp() {
        description = "Description for appointment";
        tooLongID = "1010101010101010101010101010"; 
        tooLongDescription = "Testing the discription parameters for being too long for a description parameter.";
        date = new Date(2021 - 1900, Calendar.JANUARY, 1);
        pastDate = new Date(0);
    }

    @Test
    void testUpdateAppointmentID() {
        Appointment appointment = new Appointment(); 
        assertThrows(IllegalArgumentException.class, () -> appointment.updateAppointmentID(null)); 
        assertThrows(IllegalArgumentException.class, () -> appointment.updateAppointmentID(tooLongID));
        appointment.updateAppointmentID("1234567890");
        assertEquals("1234567890", appointment.getAppointmentID());
    }

    @Test
    void testGetAppointmentID() {
        Appointment appointment = new Appointment("1234567890", date, description);
        assertNotNull(appointment.getAppointmentID()); 
        assertEquals(10, appointment.getAppointmentID().length());
        assertEquals("1234567890", appointment.getAppointmentID());
    }

    @Test
    void testUpdateDate() {
        Appointment appointment = new Appointment(); 
        assertThrows(IllegalArgumentException.class, () -> appointment.updateDate(pastDate)); 
        appointment.updateDate(null); 
        appointment.updateDate(date); 
        assertEquals(date, appointment.getAppointmentDate());
    }

    @Test
    void testGetAppointmentDate() {
        Appointment appointment = new Appointment("1234567890", date, description);
        assertNotNull(appointment.getAppointmentDate()); 
        assertEquals(date, appointment.getAppointmentDate()); 
    }

    @Test
    void testUpdateDescription() {
        Appointment appointment = new Appointment(); 
        assertThrows(IllegalArgumentException.class, () -> appointment.updateDescription(null));
        assertThrows(IllegalArgumentException.class, () -> appointment.updateDescription(tooLongDescription)); 
        appointment.updateDescription(description);
        assertEquals(description, appointment.getDescription());
    }

    @Test
    void testGetDescription() {
        Appointment appointment = new Appointment("1234567890", date, description);
        assertNotNull(appointment.getDescription()); 
        assertTrue(appointment.getDescription().length() < 59); 
        assertEquals(description, appointment.getDescription());
    }
}
