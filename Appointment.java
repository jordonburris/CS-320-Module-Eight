package appointement;
import java.util.Date;

public class Appointment {
    private String appointmentID;
    private Date appointmentDate;
    private String description; 

    public Appointment(String appointmentID, Date appointmentDate, String description) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {
        return description;
    }

	public Object updateAppointmentID() {
		return new Appointment;
	}

	public Object updateDate() {
		return new Date;
	}
}