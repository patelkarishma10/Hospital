package Logic;

import Model.Doctor;
import Model.HospitalAdmin;
import Model.Nurse;
import Model.Patient;
import Model.Receptionist;
import Model.Team;

public class Runner {

	public static void main(String[] args) {
		Nurse nurse1 = new Nurse("nurse1", 1);
		Doctor doc1 = new Doctor("doc1", 2, 3, 1);
		Doctor doc2 = new Doctor("doc2", 3, 2, 1);
		Doctor doc3 = new Doctor("doc3", 4, 1, 1);
		Doctor doc4 = new Doctor("doc4", 5, 1, 1);
		Patient patient1 = new Patient("patient1", 1, "ward1", false);
		Team team1 = new Team();
		HospitalAdmin listOfTeams = new HospitalAdmin();
		Receptionist rep1 = new Receptionist();

		System.out.println(patient1);

		// rep1.checkInPatient(patient1);
		// System.out.println(patient1);

	}

}
