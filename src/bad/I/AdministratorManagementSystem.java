package bad.I;

class AdministratorManagementSystem 
{
	private Healthcare service;
    public AdministratorManagementSystem(Healthcare service) 
    {
        this.service = service;
    }
    public void manageAdministrator() 
    {
        service.scheduleAppointment();
        service.prescribeMedication();
        service.performSurgery(); 
        service.manageInsurance(); 
        service.billPatient(); 
    }
}
