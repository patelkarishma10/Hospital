package Model;

import java.util.HashMap;

public class HospitalAdmin {
	private HashMap<Integer, Team> listOfTeams = new HashMap<>();

	public HashMap<Integer, Team> getListOfTeams() {
		return listOfTeams;
	}

	public void setListOfTeams(HashMap<Integer, Team> listOfTeams) {
		this.listOfTeams = listOfTeams;
	}

}
