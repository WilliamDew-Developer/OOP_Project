
public class Takeoff {
	
	static String weather = "weather_condition";//Weather.getWeather();
	
	public static void takeoff(FlightList flightList) {
		String destination;//used as temporary variable to send off planes
		Flight flight;//used as temporary variable for send method
		if(weather.equalsIgnoreCase("clear"))
			for(int i = 0; i < flightList.length; i++) {
				flight = flightList[i];
				destination = flightList[i].getDestAp();
				flightList[i].send(flight, destination);
			}
	}
	
	public void send(Flight flight, String destination) {
		System.out.println("Flight " + flight + " has departed for " + destination);
		
		//remove flight object from array
		
	} 
	static void doNothing() {
		System.out.print("It works");
	}

}
