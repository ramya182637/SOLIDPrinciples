package bad.I;

class Administrator implements Healthcare
{
	public void scheduleAppointment() 
	{
        // Administrator-specific logic for scheduling appointments
        System.out.println("Administrator scheduling appointment...");
    }
    public void prescribeMedication() 
    {
        // Administrator-specific logic for prescribing medications
        System.out.println("Administrator prescribing medication...");
    }
    public void performSurgery() 
    {
        // Administrator-specific logic for performing surgery (not applicable)
        throw new UnsupportedOperationException("Administrators cannot perform surgery");
    }
    public void manageInsurance() 
    {
        // Administrator-specific logic for managing insurance (not applicable)
        throw new UnsupportedOperationException("Administrators cannot manage insurance");
    }
    public void billPatient() 
    {
        // Administrator-specific logic for billing patients (not applicable)
        throw new UnsupportedOperationException("Administrators cannot bill patients");
    }
}
