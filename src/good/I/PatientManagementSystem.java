package good.I;

class PatientManagementSystem 
{
	private AppointmentScheduler scheduler;
    private MedicationPrescriber prescriber;
    private Surgeon surgeon;
    private InsuranceManager insuranceManager;
    private PatientBiller patientBiller;

    public PatientManagementSystem(AppointmentScheduler scheduler, MedicationPrescriber prescriber,
                                   Surgeon surgeon, InsuranceManager insuranceManager, 
                                   PatientBiller patientBiller) 
    {
        this.scheduler = scheduler;
        this.prescriber = prescriber;
        this.surgeon = surgeon;
        this.insuranceManager = insuranceManager;
        this.patientBiller = patientBiller;
    }

    public void managePatient() 
    {
        scheduler.scheduleAppointment();
        prescriber.prescribeMedication();
        if (surgeon != null) 
        {
            surgeon.performSurgery();
        }
        else 
        {
            System.out.println("Surgeon service not available for this role.");
        }
        if (insuranceManager != null) 
        {
            insuranceManager.manageInsurance();
        }
        else {
            System.out.println("Insurance manager service not available for this role.");
        }
        if (patientBiller != null) 
        {
            patientBiller.billPatient();
        } 
        else 
        {
            System.out.println("Patient biller service not available for this role.");
        }
    }
}
