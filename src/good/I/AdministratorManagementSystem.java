package good.I;

class AdministratorManagementSystem 
{
	private AppointmentScheduler scheduler;

    public AdministratorManagementSystem(AdministratorService administratorService) 
    {
        this.scheduler = administratorService;
    }
    public void manageAdministrator()
    {
        scheduler.scheduleAppointment();
    }
}
