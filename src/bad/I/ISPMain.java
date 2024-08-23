package bad.I;

public class ISPMain 
{
	public static void main(String[] args)
	{
		Healthcare doctor = new Doctor();
        PatientManagementSystem patientSystem = new PatientManagementSystem(doctor);
        patientSystem.managePatient();

        Healthcare nurse = new Nurse();
        PatientManagementSystem nursePatientSystem = new PatientManagementSystem(nurse);
        // NurseService throws unsupported operation exceptions
        nursePatientSystem.managePatient(); 

        Healthcare admin = new Administrator();
        AdministratorManagementSystem adminSystem = new AdministratorManagementSystem(admin);
        // AdministratorService throws unsupported operation exceptions
        adminSystem.manageAdministrator(); 
	}
}
