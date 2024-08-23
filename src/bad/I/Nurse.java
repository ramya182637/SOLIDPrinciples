package bad.I;

public class Nurse implements Healthcare
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
    public void performSurgery() 
    {
        // Nurse-specific logic for performing surgery (not typically performed by nurses)
        throw new UnsupportedOperationException("Nurses cannot perform surgery");
    }
    public void manageInsurance()
    {
        // Nurse-specific logic for managing insurance (not typically performed by nurses)
        throw new UnsupportedOperationException("Nurses cannot manage insurance");
    }
    public void billPatient() 
    {
        // Nurse-specific logic for billing patients (not typically done by nurses)
        throw new UnsupportedOperationException("Nurses cannot bill patients");
    }
}
