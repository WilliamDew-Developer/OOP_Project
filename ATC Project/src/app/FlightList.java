package app;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private String listName;
    private List<Flight> flightList;
    private int size = 0;
   
    public void printFlightList() {
        System.out.println("\t\t\tFlight list for the listing: " + listName + "\t\t\t");
        for(int i = 0; i < flightList.size(); i++){
            System.out.println("FlightID: " + flightList.get(i).getFlightId()+ "\nFlight Date: " + flightList.get(i).getFlightDate() + "\nSource Airport: " +flightList.get(i).getSourceAp()+"\nDestination Airport: " + flightList.get(i).getDestAp() + "\nPlaneID: " + flightList.get(i).getPlaneId() + "\nExpected Gate ID: " + flightList.get(i).getExpGateId() + "\nGate ID: " +flightList.get(i).getGateId() + "\nTime of Departure: " +flightList.get(i).getToD()+ "\nTime of Arrival: " +flightList.get(i).getToA());
            System.out.println();
        }
    }
    
    public FlightList(String listName){
        this.listName = listName;
        this.flightList = new ArrayList<>();
    }

    public void addToList(Flight flight){
        flightList.add(flight);
        size++;
    }

    public void removeFromList(Flight flight){
        flightList.remove(flight);
        size--;
    }

    public int getSize(){
        return size;
    }

    public Flight getFlight(int index){
        return flightList.get(index);
    }
}