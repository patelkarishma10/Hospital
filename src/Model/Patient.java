package Model;

public class Patient {
	private String name;
	private int pId;
	private String ward;
	private boolean checkedIn;

	public Patient(String name, int pId, String ward, boolean checkedIn) {
		this.name = name;
		this.pId = pId;
		this.ward = ward;
		this.checkedIn = checkedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	@Override
	public String toString() {
		return name + " " + pId + " " + ward + " " + checkedIn;
	}

}
