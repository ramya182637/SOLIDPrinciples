package good.I;

class Nurse implements AppointmentScheduler, MedicationPrescriber
{
	 public void scheduleAppointment() 
	 {
	        // Nurse-specific logic for scheduling appointments
	        System.out.println("Nurse scheduling appointment...");
	    }

	    public void prescribeMedication() 
	    {
	        // Nurse-specific logic for prescribing medications
	        System.out.println("Nurse prescribing medication...");
	    }
}
