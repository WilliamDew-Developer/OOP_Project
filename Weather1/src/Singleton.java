import java.util.Random;

public class Singleton {

	
	private static Singleton firstInstance = null;

	// Enum for 4 Seasons
	enum Season {
		WINTER, SPRING, SUMMER, FALL
	}
	
	// Enum for 2 weather conditions
	enum Weather {
		CLEAR, SEVERE_WEATHER
	}

	// Class to randomly choose a value
	class RandomEnumWeather<E extends Enum<Weather>> {
		Random RND = new Random();
		E[] values;

		public RandomEnumWeather(Class<E> token) {
			values = token.getEnumConstants();
		}

		public E randomWeather() {
			return values[RND.nextInt(values.length)];
		}

	}

	// **********************************************
	class RandomEnumSeason<E extends Enum<Season>> {
		Random RND = new Random();
		E[] values;

		public RandomEnumSeason(Class<E> token) {
			values = token.getEnumConstants();
		}

		public E randomSeason() {
			return values[RND.nextInt(values.length)];
		}

	}

	// Randomly picks a season from Enum list
	RandomEnumSeason<Season> r = new RandomEnumSeason<Season>(Season.class);

	// Randomly picks a weather condition from Enum list
	RandomEnumWeather<Weather> e = new RandomEnumWeather<Weather>(Weather.class);

	// Generates a random season
	Season Cseason = r.randomSeason();

	// Generates a random weather event
	Weather weather1 = e.randomWeather();
	

	Weather condition = weather1;
	

	Season Currseason = Cseason;
	
	
	boolean status = false;

	// Private singleton to prevent instantiation.
	private Singleton() {
	}

	public static Singleton getInstance() {

		if (firstInstance == null) {

			firstInstance = new Singleton();

		}

		return firstInstance;
	}

	public Season getSeason() {
		return firstInstance.Cseason;
	}

	public Weather getWeather() {
		return firstInstance.weather1;
	}

	int newWeather;	
	String weatherCondition;
	
	public String getCurrentCondition(Weather condition) {
		
		String currentCondition = GetCurrentWeather.getCondition(condition);
		
		weatherCondition = currentCondition;
		
		return weatherCondition;
	}
	
	public int getCurrentWeather(Weather condition, Season Currseason) {
		
		int currentWeather = GetCurrentWeather.getWeather(condition, Currseason);
		
		newWeather = currentWeather;
		
		
		return newWeather;
	}
	

	public boolean PreFlight() {
		return status = Preflight.PreFlightStatus(condition);	
	}

//	public void DelayFlights(boolean status) {
//		DelayFlights.GroundFlights(status);
//	}
	
	public void DisplayCurrentWeather() {
		
		DisplayCurrentWeather newW = new DisplayCurrentWeather();
		
		newW.DisplayWeather(newWeather);
		
		newW.DisplayCondition(weatherCondition);
	}

}
