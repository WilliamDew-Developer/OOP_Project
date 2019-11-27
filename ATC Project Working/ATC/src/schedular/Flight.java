package schedular;

public class Flight {
    
    int flightId;
    String flightDate;
    String sourceAp;
    String destAp;
    int planeId;
    String expGateId;
    String gateId;
    int ToD;
    int ToA;

    public Flight(int flightId, String flightDate, String sourceAp, String destAp, 
    int planeId, String expGateId, String gateId, int ToD, int ToA){
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.sourceAp = sourceAp;
        this.destAp = destAp;
        this.planeId = planeId;
        this.expGateId = expGateId;
        this.gateId = gateId;
        this.ToD = ToD;
        this.ToA = ToA;
    }

    public int getFlightId() {
        return this.flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightDate() {
        return this.flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getSourceAp() {
        return this.sourceAp;
    }

    public void setSourceAp(String sourceAp) {
        this.sourceAp = sourceAp;
    }

    public String getDestAp() {
        return this.destAp;
    }

    public void setDestAp(String destAp) {
        this.destAp = destAp;
    }

    public int getPlaneId() {
        return this.planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public String getExpGateId() {
        return this.expGateId;
    }

    public void setExpGateId(String expGateId) {
        this.expGateId = expGateId;
    }

    public String getGateId() {
        return this.gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    public int getToD() {
        return this.ToD;
    }

    public void setToD(int ToD) {
        this.ToD = ToD;
    }

    public int getToA() {
        return this.ToA;
    }

    public void setToA(int ToA) {
        this.ToA = ToA;
    }

    public void printFlightInfo(){
        System.out.println("FlightID: " + flightId+ "\nFlight Date: " + flightDate + "\nSource Airport: " +sourceAp+ "\nDestination Airport: " + destAp + "\nPlaneID: " + planeId + "\nExpected Gate ID: " + expGateId + "\nGate ID: " +gateId + "\nTime of Departure: " +ToD+ "\nTime of Arrival: " +ToA);
    }
}