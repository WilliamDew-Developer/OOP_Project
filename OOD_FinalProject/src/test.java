

import java.util.Iterator;
import java.util.List;

import scheduler.Flight;
import scheduler.FlightList;
import scheduler.Loader;
import scheduler.PersistentTime;
import gates.GateManipulator;
import gates.Gates;
import takeoffandlanding.Takeoff;

public class test {
	public static void main(String[] args) {
		Loader l = new Loader();
		l.loadFlights();
		Takeoff to = new Takeoff();
		List<Flight> f = l.getQuarter1();
		
		//TESTING
		if(f.isEmpty()) {
			System.out.println("load did not work");
		}
		
		int index = 0;
		
//		for(Flight flight : f) {
//			System.out.println("In for");
//			System.out.println(flight.getSourceAp());
//		}
		
		PersistentTime pt = PersistentTime.getInstance();
		FlightList fl = to.takeoff();
		f = to.getQuarterList(1);
		
		if(f.isEmpty()) {
			System.out.println("load did not work");
		}
		
		Iterator flightListIterator = fl.createIterator();
//		
//		while(flightListIterator.hasNext()) {
//			Flight flight = (Flight) flightListIterator.next();
//			
//			System.out.println("In for");
//			System.out.println(fl.getFlight(index).getDestAp());
//		}
	}
}
