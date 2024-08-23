package good.I;

class Doctor implements AppointmentScheduler, MedicationPrescriber, Surgeon, InsuranceManager, PatientBiller
{
	public void scheduleAppointment()
	{
        // Doctor-specific logic for scheduling appointments
        System.out.println("Doctor scheduling appointment...");
    }
    public void prescribeMedication()
    {
        // Doctor-specific logic for prescribing medications
        System.out.println("Doctor prescribing medication...");
    }
    public void performSurgery()
    {
        // Doctor-specific logic for performing surgery
        System.out.println("Doctor performing surgery...");
    }
    public void manageInsurance()
    {
        // Doctor-specific logic for managing insurance
        System.out.println("Doctor managing insurance...");
    }
    public void billPatient() 
    {
        // Doctor-specific logic for billing patients
        System.out.println("Doctor billing patient...");
    }
}
