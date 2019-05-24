package Model;

public class Staff {
	private String name;
	private int sId;

	public Staff(String name, int sId) {
		this.name = name;
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	@Override
	public String toString() {
		return name + " " + sId;
	}
}
