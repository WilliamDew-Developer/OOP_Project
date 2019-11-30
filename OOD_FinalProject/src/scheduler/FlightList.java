package scheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc
 * 
 * This class allows each flight to be grouped into a list
 */

public class FlightList {
    private List<Flight> flightList;
    private int size = 0;
   
    
    /**
     * A method to print the current FlightList
     *@return prints the flightlist
     **/
    public void printFlightList() {
        System.out.println("\t\t\tFlight list for the listing: \t\t\t");
        for(int i = 0; i < flightList.size(); i++){
            System.out.println("FlightID: " + flightList.get(i).getFlightId()+ 
            		"\nFlight Date: " + flightList.get(i).getFlightDate() + 
            		"\nSource Airport: " +flightList.get(i).getSourceAp() +
            		"\nDestination Airport: " + flightList.get(i).getDestAp() + 
            		"\nExpected Gate ID: " + flightList.get(i).getExpGateId() + 
            		"\nGate ID: " +flightList.get(i).getGateId() + 
            		"\nTime of Departure: " +flightList.get(i).getToD()+ 
            		"\nTime of Arrival: " +flightList.get(i).getToA());
            System.out.println();
        }
    }
    
    /**
     * A constructor for flightlists that creates an ArrayList
     * @param listName
     * 
     * 
     */
    public FlightList(){
        this.flightList = new ArrayList<>();
    }

    /**
     * A method to add flights to the list
     * 
     * @param flight
     */
    public void addToList(Flight flight){
        flightList.add(flight);
        size++;
    }

    /**
     *removes a flight from the list
     *
     * @param flight
     */
    public void removeFromList(Flight flight){
        flightList.remove(flight);
        size--;
    }

    /**
     * returns the size of the FlightList
     * 
     * @return size of FlightList (int)
     */
    public int getSize(){
        return size;
    }

    /**
     * returns Flight object at a specific index in the FlightList
     * 
     * @param index of requested Flight object
     * @return Flight object
     */
    public Flight getFlight(int index){
        return flightList.get(index);
    }

    
    /**
     * returns the Time of Arrival of a Flight object at the specified index
     * 
     * @param flightList
     * @param index of Flight
     * @return time of arrival of Flight at requested index
     */
    public int getToA(FlightList flightList, int index) {
        int ToA = flightList.getFlight(index).getToA();
        return ToA;
    }
}