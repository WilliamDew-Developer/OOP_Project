import java.util.ArrayList;

public class GateManipulator {
	ArrayList<Gates> gateList = new ArrayList();
	Gates a1 = new Gates("C3", -1, 1, 1); // Negative 1 symbolizes an empty field due to pointer exceptions when using null.
	Gates a2 = new Gates("B10", -1, 2, 2);
	Gates a3 = new Gates("A7", -1, 3, 3);
	Gates a4 = new Gates("A8", -1, 4, 4);
	Gates a5 = new Gates("T3", -1, 5, 5);
	Gates a6 = new Gates("B13", -1, 6, 6);
	Gates a7 = new Gates("A13", -1, 7, 7);
	Gates a8 = new Gates("C11", -1, 8, 8);
	Gates a9 = new Gates("A1", -1, 9, 9);
	Gates a10 = new Gates("C8", -1, 10, 10);
	Gates a11 = new Gates("B7", -1, 11, 11);
	Gates a12 = new Gates("T6", -1, 12, 12);
	Gates a13 = new Gates("A18", -1, 13, 13);
	Gates a14 = new Gates("B3", -1, 14, 14);
	Gates a15 = new Gates("C15", -1, 15, 15);
	Gates a16 = new Gates("A5", -1, 16, 16);
	Gates a17 = new Gates("A14", -1, 17, 17);
	Gates a18 = new Gates("A15", -1, 18, 18);
	Gates a19 = new Gates("A9", -1, 19, 19);
	Gates a20 = new Gates("B1", -1, 20, 20);
	Gates a21 = new Gates("B15", -1, 21, 21);
	Gates a22 = new Gates("B6", -1, 22, 22);
	Gates a23 = new Gates("C10", -1, 23, 23);
	Gates a24 = new Gates("B8", -1, 24, 24);
	Gates a25 = new Gates("C4", -1, 25, 25);
	
	/**
	 * constructor for gates manipulator that instantiates all gates
	 */
	public GateManipulator() {
		addingGates();
	}
	
	/**
	 * adds gates into gateList
	 */
	public void addingGates() {
		gateList.add(a1);
		gateList.add(a2);
		gateList.add(a3);
		gateList.add(a4);
		gateList.add(a5);
		gateList.add(a6);
		gateList.add(a7);
		gateList.add(a8);
		gateList.add(a9);
		gateList.add(a10);
		gateList.add(a11);
		gateList.add(a12);
		gateList.add(a13);
		gateList.add(a14);
		gateList.add(a15);
		gateList.add(a16);
		gateList.add(a17);
		gateList.add(a18);
		gateList.add(a19);
		gateList.add(a20);
		gateList.add(a21);
		gateList.add(a22);
		gateList.add(a23);
		gateList.add(a24);
		gateList.add(a25);
	}
	
	public boolean gateIsEmpty(Gates A) {
		if ((A.getPlaneID()) == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void updatePID(int pID, int gID) {
		int index = gID - 1;
		gateList.get(index).setPlaneID(pID);
		gateList.set(index, gateList.get(index));
	}
	
	public void updatingGates(String gName, int pID, int eID, int gID) {
		int index = gID - 1; 
		
		gateList.get(index).setGateName(gName);
		gateList.get(index).setPlaneID(pID);
		gateList.get(index).setExpectedPlaneID(eID);
		gateList.set(index, gateList.get(index));
	}

	public void chaos() {
		updatingGates("A8", 2, 4, 4);
		updatingGates("B13", 7, 6, 6);
		updatingGates("A14", 24, 17, 17);
	}
}
