public class Volunteer {

	private String associationName;

	double Pay() {
		return 0;
	}

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	@Override
	public String toString() {
		return "Volunteer [associationName=" + associationName + "]";
	}
	
	

}
