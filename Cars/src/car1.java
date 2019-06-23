
public class car1 {
	String model;
	String manufacturer;
	String color;
	double mileage;
	double fuelTankCapacity;
	double currentSpeed;
	double currentFuelLevel;
	String currentDirection;
	double odometer;

	car1(String model, String manufacturer, String color, double mileage, double fuelTankCapacity)   
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.mileage = mileage;
		this.fuelTankCapacity = fuelTankCapacity;
		this.currentSpeed = 0.0;
		this.currentFuelLevel = 1.0;
		this.currentDirection = "North";
		this.odometer = 0.0;
	}

	void drive (double drivingSpeed, String drivingDirection, double distanceTraveled) {
		currentSpeed = drivingSpeed;
		currentDirection = drivingDirection;
		double gasCurrent = fuelTankCapacity * currentFuelLevel;
		double gasConsumed = distanceTraveled / mileage;
		gasCurrent = gasCurrent - gasConsumed;
		currentFuelLevel = gasCurrent / fuelTankCapacity;
		this.odometer = this.odometer + distanceTraveled;
	}
	
	void park () {
		this.currentSpeed = 0.0;
		System.out.println("The car has been parked!");
		
	}
	
	void turn (String turnDirection) {
		if(turnDirection.toUpperCase().equals("RIGHT")) {
			if(currentDirection.toUpperCase().contentEquals("NORTH") ) {
				currentDirection = "EAST";
			}
			else if(currentDirection.toUpperCase().contentEquals("EAST") ) {
				currentDirection = "SOUTH";
			}
			else if(currentDirection.toUpperCase().contentEquals("SOUTH") ) {
				currentDirection = "WEST";
			}
			else if(currentDirection.toUpperCase().contentEquals("WEST") ) {
				currentDirection = "NORTH";
			}
		}
		else if(turnDirection.toUpperCase().equals("LEFT")) {
			if(currentDirection.toUpperCase().contentEquals("NORTH") ) {
				currentDirection = "WEST";
			}
			else if(currentDirection.toUpperCase().contentEquals("EAST") ) {
				currentDirection = "NORTH";
			}
			else if(currentDirection.toUpperCase().contentEquals("SOUTH") ) {
				currentDirection = "EAST";
			}
			else if(currentDirection.toUpperCase().contentEquals("WEST") ) {
				currentDirection = "SOUTH";
			}
		}
	
	String getModel() {
		return model;
	}
	
	public static void main(String[] args) {
		car1 myCar = new car1 ();
		myCar.manufacturer = "Smart";
		myCar.model = "Fortwo";
		myCar.color = "grey";
		myCar.mileage = 35;
		myCar.fuelTankCapacity = 10;
		System.out.println(myCar.getModel());
		myCar.currentFuelLevel = 1;
		myCar.drive(50, "west",20);
	}
}
