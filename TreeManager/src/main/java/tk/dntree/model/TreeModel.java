package tk.dntree.model;

public class TreeModel extends AbstractModel<TreeModel>{
	private String specieTree;
	private String typeTree;
	private double latitude;
	private double longitude;
	private String addressTree;
	private double height;
	private int ageTree;
	private String status;
	public String getSpecieTree() {
		return specieTree;
	}
	public void setSpecieTree(String specieTree) {
		this.specieTree = specieTree;
	}
	public String getTypeTree() {
		return typeTree;
	}
	public void setTypeTree(String typeTree) {
		this.typeTree = typeTree;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getAddressTree() {
		return addressTree;
	}
	public void setAddressTree(String addressTree) {
		this.addressTree = addressTree;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAgeTree() {
		return ageTree;
	}
	public void setAgeTree(int ageTree) {
		this.ageTree = ageTree;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
