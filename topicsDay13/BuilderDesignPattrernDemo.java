package chapter4;

//step 1
interface Builder {
	void reset();

	void setSeats(int number);

	void setEngine(String engine);

	void setTripComputer(boolean hasTripComputer);

	void setGPS(boolean hasGPS);
}

//Using the Builder pattern makes sense only when your products
//are quite complex and require extensive configuration. The
//following two products are related, although they don't have
//a common interface.

//step 2
class Car {
	private int seats;
	private String engine;
	private boolean tripComputer;
	private boolean gps;

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public boolean isTripComputer() {
		return tripComputer;
	}

	public void setTripComputer(boolean tripComputer) {
		this.tripComputer = tripComputer;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	@Override
	public String toString() {
		return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
	}

}

//step 3
class Manual {
	private int seats;
	private String engineInstructions;
	private String tripComputerInstructions;
	private String gpsInstructions;

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getEngineInstructions() {
		return engineInstructions;
	}

	public void setEngineInstructions(String engineInstructions) {
		this.engineInstructions = engineInstructions;
	}

	public String getTripComputerInstructions() {
		return tripComputerInstructions;
	}

	public void setTripComputerInstructions(String tripComputerInstructions) {
		this.tripComputerInstructions = tripComputerInstructions;
	}

	public String getGpsInstructions() {
		return gpsInstructions;
	}

	public void setGpsInstructions(String gpsInstructions) {
		this.gpsInstructions = gpsInstructions;
	}
}
// Each car should have a user manual that corresponds to
// the car's configuration and describes all its features.

//step 4  Implement Concrete Builders
class CarBuilder implements Builder {
	private Car car;

	public CarBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.car = new Car();
	}

	@Override
	public void setSeats(int number) {
		car.setSeats(number);
	}

	@Override
	public void setEngine(String engine) {
		car.setEngine(engine);
	}

	@Override
	public void setTripComputer(boolean hasTripComputer) {
		car.setTripComputer(hasTripComputer);
	}

	@Override
	public void setGPS(boolean hasGPS) {
		car.setGps(hasGPS);
	}

	public Car getResult() {
		return this.car;
	}
}

//step 5 CarManualBuilder 

class CarManualBuilder implements Builder {

	private Manual manual;

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSeats(int number) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEngine(String engine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTripComputer(boolean hasTripComputer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setGPS(boolean hasGPS) {
		// TODO Auto-generated method stub

	}
	
	   public Manual getResult() {
	        return this.manual;
	    }

}
//step 7 create the class of director

class Director {
	// creat two for methods for SUV and Sport car
	public void constructSportCar(Builder builder) {

		builder.reset();
		builder.setSeats(2);
		builder.setEngine("V8 Engine");
		builder.setTripComputer(true);
		builder.setGPS(true);

	}

	public void constructSuvCar(Builder builder) {
		builder.reset();
		builder.setSeats(7);
		builder.setEngine("Diesel Engine");
		builder.setTripComputer(false);
		builder.setGPS(true);
	}
}

public class BuilderDesignPattrernDemo {

	public static void main(String[] args) {
		Director director = new Director();

		// Build a sports car
		CarBuilder carBuilder = new CarBuilder();
		director.constructSportCar(carBuilder);
		Car sportsCar = carBuilder.getResult();
		System.out.println("Built Car: " + sportsCar);

		// Build a manual for the sports car
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportCar(manualBuilder);
		Manual sportsCarManual = manualBuilder.getResult();
		System.out.println("Built Manual: " + sportsCarManual);

		// Build an SUV
		director.constructSuvCar(carBuilder);
		Car suv = carBuilder.getResult();
		System.out.println("Built Car: " + suv);

	}

}
