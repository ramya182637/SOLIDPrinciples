package bad.I;

class PatientManagementSystem 
{
	private Healthcare service;
    public PatientManagementSystem(Healthcare service) 
    {
        this.service = service;
    }
    public void managePatient() 
    {
        service.scheduleAppointment();
        service.prescribeMedication();
     // Potential issue with NurseService or AdministratorService
        service.performSurgery(); 
     // Potential issue with NurseService or AdministratorService
        service.manageInsurance(); 
     // Potential issue with NurseService or AdministratorService
        service.billPatient(); 
    }
}
