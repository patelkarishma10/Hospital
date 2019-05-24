package Model;

import Interface.CheckInable;

public class Receptionist implements CheckInable {

	@Override
	public void checkInPatient(Patient p) {
		p.setCheckedIn(true);
	}

}
