import java.util.ArrayList;

public class RunwayManipulator {
	ArrayList<Runways> runwayList = new ArrayList();
	Runways r1 = new Runways("R1", -1);
	Runways r2 = new Runways("R2", -1);
	Runways r3 = new Runways("R3", -1);
	Runways r4 = new Runways("R4", -1);
	
	public void addingRunways() {
		runwayList.add(r1);
		runwayList.add(r2);
		runwayList.add(r3);
		runwayList.add(r4);
	}
	
	public boolean runwayIsEmpty(Runways A) {
		if ((A.getPlaneID()) == -1) {
			return true;
		}
		else {
			return false;
		}
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
	
	public void chaos() {
		updatingRunways("R1", 8);
		updatingRunways("R2", 1);
		updatingRunways("R3", 23);
		updatingRunways("R4", 16);
	}
}
