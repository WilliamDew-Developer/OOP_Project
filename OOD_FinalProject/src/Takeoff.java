import java.util.List;

import scheduler.Flight;
import scheduler.FlightList;
import scheduler.PersistentTime;

public class Takeoff {
	PersistentTime pt;
	
	//need to get current weather to check conditions
	//weatherConditions blahblahblah
	
	/**
	 * checks the conditions of the waether, as well as the current time in order to decide what 
	 * plane are able to be launched, and sends this list to the to takeoffFrame class
	 * @param flightList
	 */
	public void takeoff(FlightList flightList) {
		pt = PersistentTime.getInstance();
		int currentTime = pt.getTime();
		
		String destination;//used as temporary variable to send off planes
		Flight flight;//used as temporary variable for send method
		if(weather.equalsIgnoreCase("clear"))
			for(int i = 0; i < flightList.length; i++) {
				flight = flightList[i];
				destination = flightList[i].getDestAp();
				flightList[i].send(flight, destination);
			}
	}
	
	public List<Flight> checkQuarter(int currentTime) {
		if(currentTime == 1) {
			
		}else if(){
			
		}else if() {
			
		}
	}
}
