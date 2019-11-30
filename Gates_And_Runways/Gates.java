
public class Gates {
	private String gateName;
	private int planeID;
	private int expectedPlaneID;
	private int gateID;
	
	Gates(String gName, int pID, int eID, int gID) {
		this.gateName = gName;
		this.planeID = pID;
		this.expectedPlaneID = eID;
		this.gateID = gID;
	}

	public void setGateID(int gateID) {
		this.gateID = gateID;
	}
	
	public int getGateID() {
		return gateID;
	}
	
	public String getGateName() {
		return gateName;
	}

	public void setGateName(String gateName) {
		this.gateName = gateName;
	}

	public void setPlaneID(int planeID) {
		this.planeID = planeID;
	}
	
	public int getPlaneID() {
		return planeID;
	}
	
	public void setExpectedPlaneID(int expectedPlaneID) {
		this.expectedPlaneID = expectedPlaneID;
	}
	
	public int getExpectedPlaneID() {
		return expectedPlaneID;
	}
}
