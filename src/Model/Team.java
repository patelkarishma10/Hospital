package Model;

import java.util.ArrayList;

public class Team {
	private ArrayList<Doctor> teamList = new ArrayList<>();

	public ArrayList<Doctor> getTeamList() {
		return teamList;
	}

	public void setTeamList(ArrayList<Doctor> teamList) {
		this.teamList = teamList;
	}

}
