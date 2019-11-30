
public class Runways {
	private String runwayID;
	private int planeID;
	
	Runways(String rID, int pID) {
		this.runwayID = rID;
		this.planeID = pID;
	}

	public String getRunwayID() {
		return runwayID;
	}

	public void setRunwayID(String runwayID) {
		this.runwayID = runwayID;
	}

	public int getPlaneID() {
		return planeID;
	}

	public void setPlaneID(int planeID) {
		this.planeID = planeID;
	}
}
