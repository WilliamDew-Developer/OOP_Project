package app;

import java.util.ArrayList;
import java.util.List;

public class Q3List implements QuarterComposite {
    private String quarter;
    private List<Flight> q3Flights;
    
    @Override
    public void printQuarterList() {
        System.out.println("\t\t\tFlight list for the listing: " + quarter + "\t\t\t");
        for(int i = 0; i < q3Flights.size(); i++){
            System.out.println("FlightID: " + q3Flights.get(i).getFlightId()+ "\nFlight Date: " + q3Flights.get(i).getFlightDate() + "\nSource Airport: " +q3Flights.get(i).getSourceAp()+"\nDestination Airport: " + q3Flights.get(i).getDestAp() + "\nPlaneID: " + q3Flights.get(i).getPlaneId() + "\nExpected Gate ID: " + q3Flights.get(i).getExpGateId() + "\nGate ID: " +q3Flights.get(i).getGateId() + "\nTime of Departure: " +q3Flights.get(i).getToD()+ "\nTime of Arrival: " +q3Flights.get(i).getToA());
            System.out.println();
        }
    }
    
    public Q3List(String quarter){
        this.quarter = quarter;
        this.q3Flights = new ArrayList<>();
    }

    @Override
    public void addToQuarter(FlightList flightList){
        for (int i = 0; i < flightList.getSize(); i++){
            if ((flightList.getFlight(i).getToD() > 50 && flightList.getFlight(i).getToD() <= 75) && (flightList.getFlight(i).getToA() == -1)){
                q3Flights.add(flightList.getFlight(i));
            }
            else if ((flightList.getFlight(i).getToA() > 50 && flightList.getFlight(i).getToA() <= 75) && (flightList.getFlight(i).getToD() == -1)){
                q3Flights.add(flightList.getFlight(i));
            }
        }
        System.out.println("All possible flights added to quarter for the day.");
    }

}