package app;

import java.util.ArrayList;
import java.util.Stack;

public class test {


	public static void main(String[] args) throws Exception {

       Flight flight1 = new Flight(1, "2019-01-01", "ATL", "ADQ", 1, "C3", "", 10, -1);
        flight1.setGateId(null);
        Flight flight2 = new Flight(2, "2019-01-01", "ATL", "PWN", 2, "B10", "", 21, -1);
        flight2.setGateId(null);
        Flight flight3 = new Flight(3, "2019-01-01", "ATL", "PWN", 3, "A7", "", 56, -1);
        flight3.setGateId(null);
        Flight flight4 = new Flight(4, "2019-01-01", "MLB", "ATL", 4, "A8", "", -1, 87);
        flight4.setGateId(null);
        Flight flight5 = new Flight(5, "2019-01-01", "BNA", "ATL", 5, "T3", "", -1, 32);
        flight5.setGateId(null);
        Flight flight6 = new Flight(6, "2019-01-01", "SFB", "ATL", 6, "B13", "", -1, 42);
        flight6.setGateId(null);
        Flight flight7 = new Flight(7, "2019-01-01", "ATL", "IWA", 7, "A13", "", 74, -1);
        flight7.setGateId(null);
        Flight flight8 = new Flight(8, "2019-01-01", "ATL", "FAT", 8, "C11", "", -1, 64);
        flight8.setGateId(null);
        Flight flight9 = new Flight(9, "2019-01-01", "TPA", "ATL", 9, "A1", "", -1, -61);
        flight9.setGateId(null);
        Flight flight10 = new Flight(10, "2019-01-01", "ATL", "OKC", 10, "C8", "", 91, -1);
        flight10.setGateId(null);
        
        

        FlightList list001 = new FlightList("Practice List 1");
        list001.addToList(flight1);
        list001.addToList(flight2);
        list001.addToList(flight3);
        list001.addToList(flight4);
        list001.addToList(flight5);
        list001.addToList(flight6);
        list001.addToList(flight7);
        list001.addToList(flight8);
        list001.addToList(flight9);
        list001.addToList(flight10);
        list001.printFlightList();

        QuarterComposite q1001 = new Q1List("Quarter 1 listings");
        q1001.addToQuarter(list001);
        q1001.printQuarterList();

        QuarterComposite q2001 = new Q2List("Quarter 2 Listings");
        q2001.addToQuarter(list001);
        q2001.printQuarterList();

        QuarterComposite q3001 = new Q3List("Quarter 3 Listings");
        q3001.addToQuarter(list001);
        q3001.printQuarterList();

        QuarterComposite q4001 = new Q4List("Quarter 4 Listings");
        q4001.addToQuarter(list001);
        q4001.printQuarterList();
        
        
    }
}

/*(2, '2019-01-01', 'ATL', 'ONT', 2, ‘B10’, NULL, 21, NULL), 
(3, '2019-01-04', 'ATL', 'PWM', 3, ‘A7’, NULL, 56, NULL),
(4, '2019-01-05', 'MLB', 'ATL', 4, ‘A8’, NULL, NULL, 87),
(5, '2019-01-01', 'BNA', 'ATL', 5, ‘T3’, NULL, NULL, 32), 
(6, '2019-01-08', 'SFB', 'ATL', 6, ‘B13’, NULL, NULL, 42), 
(7, '2019-01-10', 'ATL', 'IWA', 7, ‘A13’, NULL, 40, NULL),
(8, '2019-01-11', 'ATL', 'FAT', 8, ‘C11’, NULL, 74, NULL),
(9, '2019-01-18', 'TPA', 'ATL', 9, ‘A1’, NULL, NULL, 61), 
(10, '2019-01-12', 'ATL', 'OKC', 10, ‘C8’, NULL, 91, NULL), 
(11, '2019-01-15', 'ATL', 'HNL', 11, ‘B7’, NULL, 81, NULL), 
(12, '2019-01-20', 'HNL', 'ATL', 12, ‘T6’, NULL, NULL, 44), 
(13, '2019-01-22', 'DSM', 'ATL', 13, ‘A18’, NULL, NULL, 81),
(14, '2019-01-27', 'SBA', 'ATL', 14,‘B3’, NULL, NULL, 99), 
(15, '2019-02-01', 'EGE', 'ATL', 15,’C15’ , NULL, NULL, 28), */
