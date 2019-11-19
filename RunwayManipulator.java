import java.util.ArrayList;

public class RunwayManipulator {
	ArrayList<Runways> runwayList = new ArrayList();
	Runways r1 = new Runways("R1", (Integer) null);
	Runways r2 = new Runways("R2", (Integer) null);
	Runways r3 = new Runways("R3", (Integer) null);
	Runways r4 = new Runways("R4", (Integer) null);
	
	public void addingRunways() {
		runwayList.add(r1);
		runwayList.add(r2);
		runwayList.add(r3);
		runwayList.add(r4);
	}
	
	public void updatingRunways(String rID, int pID) {
		int index;
		if (rID.contains("R1")) {
			index = 0;
			r1.setPlaneID(pID);
			runwayList.set(index, r1);
		}
		if (rID.contains("R2")) {
			index = 1;
			r2.setPlaneID(pID);
			runwayList.set(index, r2);
		}
		if (rID.contains("R3")) {
			index = 2;
			r3.setPlaneID(pID);
			runwayList.set(index, r3);
		}
		if (rID.contains("R4")) {
			index = 3;
			r4.setPlaneID(pID);
			runwayList.set(index, r4);
		}
	}
}
