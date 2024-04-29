package appointement;
import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments;

    public AppointmentService() {
        this.appointments = new HashMap<>();
    }
    
    public void addAppointment(Appointment appointment) {
        if (appointment == null || appointment.getAppointmentID() == null) {
            throw new IllegalArgumentException("ID not allowed.");
        }
        if (appointments.containsKey(appointment.getAppointmentID())) {
            throw new IllegalArgumentException("Please use new ID.");
        }
        appointments.put(appointment.getAppointmentID(), appointment);
    }

    public void deleteAppointment(String appointmentID) {
        if (appointmentID == null) {
            throw new IllegalArgumentException("ID not allowed.");
        }
        if (!appointments.containsKey(appointmentID)) {
            throw new IllegalArgumentException("ID not found.");
        }
        appointments.remove(appointmentID);
    }
}
