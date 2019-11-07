
public class Gates {
	private String airportID;
	private String gateID;
	private int planeID;
	private int expectedPlaneID;
	
	Gates(String aID, String gID, int pID, int eID) {
		this.airportID = aID;
		this.gateID = gID;
		this.planeID = pID;
		this.expectedPlaneID = eID;
	}

	public String getAirportID() {
		return airportID;
	}

	public String getGateID() {
		return gateID;
	}

	public int getPlaneID() {
		return planeID;
	}

	public int getExpectedPlaneID() {
		return expectedPlaneID;
	}

	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}

	public void setGateID(String gateID) {
		this.gateID = gateID;
	}

	public void setPlaneID(int planeID) {
		this.planeID = planeID;
	}

	public void setExpectedPlaneID(int expectedPlaneID) {
		this.expectedPlaneID = expectedPlaneID;
	}
}
