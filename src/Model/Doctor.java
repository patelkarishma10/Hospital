package Model;

public class Doctor extends Staff {

	private int grade;
	private int teamNumber;

	public Doctor(String name, int sId, int grade, int teamNumber) {
		super(name, sId);
		this.grade = grade;
		this.teamNumber = teamNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	@Override
	public String toString() {
		return super.toString() + " " + grade + " " + teamNumber;
	}

}
