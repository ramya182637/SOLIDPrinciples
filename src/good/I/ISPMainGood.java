package good.I;

public class ISPMainGood {

	public static void main(String[] args) 
	{
		Doctor doctor = new Doctor();
        PatientManagementSystem patientSystem = new PatientManagementSystem(doctor, doctor, doctor, doctor, doctor);
        patientSystem.managePatient();

        Nurse nurse = new Nurse();
        PatientManagementSystem nursePatientSystem = new PatientManagementSystem(nurse, nurse, null, null, null);
        // NurseService only uses AppointmentScheduler and MedicationPrescriber interfaces
        nursePatientSystem.managePatient(); 

        AdministratorService admin = new AdministratorService();
        AdministratorManagementSystem adminSystem = new AdministratorManagementSystem(admin);
        // AdministratorService only uses AppointmentScheduler interface
        adminSystem.manageAdministrator(); 
	}
}
