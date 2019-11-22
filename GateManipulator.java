import java.util.ArrayList;

public class GateManipulator {
	ArrayList<Gates> gateList = new ArrayList();
	Gates a1 = new Gates("ADQ", "C3", (Integer) null, 1, 1);
	Gates a2 = new Gates("ONT", "B10", (Integer) null, 2, 2);
	Gates a3 = new Gates("PWM", "A7", (Integer) null, 3, 3);
	Gates a4 = new Gates("ATL", "A8", (Integer) null, 4, 4);
	Gates a5 = new Gates("ATL", "T3", (Integer) null, 5, 5);
	Gates a6 = new Gates("ATL", "B13", (Integer) null, 6, 6);
	Gates a7 = new Gates("IWA", "A13", (Integer) null, 7, 7);
	Gates a8 = new Gates("FAT", "C11", (Integer) null, 8, 8);
	Gates a9 = new Gates("ATL", "A1", (Integer) null, 9, 9);
	Gates a10 = new Gates("OKC", "C8", (Integer) null, 10, 10);
	Gates a11 = new Gates("HNL", "B7", (Integer) null, 11, 11);
	Gates a12 = new Gates("ATL", "T6", (Integer) null, 12, 12);
	Gates a13 = new Gates("ATL", "A18", (Integer) null, 13, 13);
	Gates a14 = new Gates("ATL", "B3", (Integer) null, 14, 14);
	Gates a15 = new Gates("ATL", "C15", (Integer) null, 15, 15);
	Gates a16 = new Gates("JAN", "A5", (Integer) null, 16, 16);
	Gates a17 = new Gates("ATL", "A14", (Integer) null, 17, 17);
	Gates a18 = new Gates("ATL", "A15", (Integer) null, 18, 18);
	Gates a19 = new Gates("ATL", "A9", (Integer) null, 19, 19);
	Gates a20 = new Gates("ATL", "B1", (Integer) null, 20, 20);
	Gates a21 = new Gates("IND", "B15", (Integer) null, 21, 21);
	Gates a22 = new Gates("ATL", "B6", (Integer) null, 22, 22);
	Gates a23 = new Gates("ERW", "C10", (Integer) null, 23, 23);
	Gates a24 = new Gates("DFW", "B8", (Integer) null, 24, 24);
	Gates a25 = new Gates("ATL", "C4", (Integer) null, 25, 25);
	
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
	
	public void updatingGates(String aID, String gName, int pID, int eID, int gID) {
		int index = gID - 1; 
		if (gID == 1) {
			a1.setAirportID(aID);
			a1.setGateName(gName);
			a1.setPlaneID(pID);
			a1.setExpectedPlaneID(eID);
			gateList.set(index, a1);
		}
		if (gID == 2) {
			a2.setAirportID(aID);
			a2.setGateName(gName);
			a2.setPlaneID(pID);
			a2.setExpectedPlaneID(eID);
			gateList.set(index, a2);
		}
		if (gID == 3) {
			a3.setAirportID(aID);
			a3.setGateName(gName);
			a3.setPlaneID(pID);
			a3.setExpectedPlaneID(eID);
			gateList.set(index, a3);
		}
		if (gID == 4) {
			a4.setAirportID(aID);
			a4.setGateName(gName);
			a4.setPlaneID(pID);
			a4.setExpectedPlaneID(eID);
			gateList.set(index, a4);
		}
		if (gID == 5) {
			a5.setAirportID(aID);
			a5.setGateName(gName);
			a5.setPlaneID(pID);
			a5.setExpectedPlaneID(eID);
			gateList.set(index, a5);
		}
		if (gID == 6) {
			a6.setAirportID(aID);
			a6.setGateName(gName);
			a6.setPlaneID(pID);
			a6.setExpectedPlaneID(eID);
			gateList.set(index, a6);
		}
		if (gID == 7) {
			a7.setAirportID(aID);
			a7.setGateName(gName);
			a7.setPlaneID(pID);
			a7.setExpectedPlaneID(eID);
			gateList.set(index, a7);
		}
		if (gID == 8) {
			a8.setAirportID(aID);
			a8.setGateName(gName);
			a8.setPlaneID(pID);
			a8.setExpectedPlaneID(eID);
			gateList.set(index, a8);
		}
		if (gID == 9) {
			a9.setAirportID(aID);
			a9.setGateName(gName);
			a9.setPlaneID(pID);
			a9.setExpectedPlaneID(eID);
			gateList.set(index, a9);
		}
		if (gID == 10) {
			a10.setAirportID(aID);
			a10.setGateName(gName);
			a10.setPlaneID(pID);
			a10.setExpectedPlaneID(eID);
			gateList.set(index, a10);
		}
		if (gID == 11) {
			a11.setAirportID(aID);
			a11.setGateName(gName);
			a11.setPlaneID(pID);
			a11.setExpectedPlaneID(eID);
			gateList.set(index, a11);
		}
		if (gID == 12) {
			a12.setAirportID(aID);
			a12.setGateName(gName);
			a12.setPlaneID(pID);
			a12.setExpectedPlaneID(eID);
			gateList.set(index, a12);
		}
		if (gID == 13) {
			a13.setAirportID(aID);
			a13.setGateName(gName);
			a13.setPlaneID(pID);
			a13.setExpectedPlaneID(eID);
			gateList.set(index, a13);
		}
		if (gID == 14) {
			a14.setAirportID(aID);
			a14.setGateName(gName);
			a14.setPlaneID(pID);
			a14.setExpectedPlaneID(eID);
			gateList.set(index, a14);
		}
		if (gID == 15) {
			a15.setAirportID(aID);
			a15.setGateName(gName);
			a15.setPlaneID(pID);
			a15.setExpectedPlaneID(eID);
			gateList.set(index, a15);
		}
		if (gID == 16) {
			a16.setAirportID(aID);
			a16.setGateName(gName);
			a16.setPlaneID(pID);
			a16.setExpectedPlaneID(eID);
			gateList.set(index, a16);
		}
		if (gID == 17) {
			a17.setAirportID(aID);
			a17.setGateName(gName);
			a17.setPlaneID(pID);
			a17.setExpectedPlaneID(eID);
			gateList.set(index, a17);
		}
		if (gID == 18) {
			a18.setAirportID(aID);
			a18.setGateName(gName);
			a18.setPlaneID(pID);
			a18.setExpectedPlaneID(eID);
			gateList.set(index, a18);
		}
		if (gID == 19) {
			a19.setAirportID(aID);
			a19.setGateName(gName);
			a19.setPlaneID(pID);
			a19.setExpectedPlaneID(eID);
			gateList.set(index, a19);
		}
		if (gID == 20) {
			a20.setAirportID(aID);
			a20.setGateName(gName);
			a20.setPlaneID(pID);
			a20.setExpectedPlaneID(eID);
			gateList.set(index, a20);
		}
		if (gID == 21) {
			a21.setAirportID(aID);
			a21.setGateName(gName);
			a21.setPlaneID(pID);
			a21.setExpectedPlaneID(eID);
			gateList.set(index, a21);
		}
		if (gID == 22) {
			a22.setAirportID(aID);
			a22.setGateName(gName);
			a22.setPlaneID(pID);
			a22.setExpectedPlaneID(eID);
			gateList.set(index, a22);
		}
		if (gID == 23) {
			a23.setAirportID(aID);
			a23.setGateName(gName);
			a23.setPlaneID(pID);
			a23.setExpectedPlaneID(eID);
			gateList.set(index, a23);
		}
		if (gID == 24) {
			a24.setAirportID(aID);
			a24.setGateName(gName);
			a24.setPlaneID(pID);
			a24.setExpectedPlaneID(eID);
			gateList.set(index, a24);
		}
		if (gID == 25) {
			a25.setAirportID(aID);
			a25.setGateName(gName);
			a25.setPlaneID(pID);
			a25.setExpectedPlaneID(eID);
			gateList.set(index, a25);
		}
	}

	// Implement Chaos
	public void chaos() {
		updatingGates("ATL", "A8", 2, 4, 4);
		updatingGates("ATL", "B13", 7, 6, 6);
		updatingGates("ATL", "A14", 24, 17, 17);
	}
}
