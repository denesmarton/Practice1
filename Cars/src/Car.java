
public class Car {
	  String model;
	  String manufacturer;
	  String color;
	  double mileage;
	  double fuelTankCapacity;
	  double currentSpeed;
	  double currentFuelLevel; // % full, as a number between 0 and 1
	  String currentDirection;
	  double odometer;
	  StringBuilder travelLog;
	  
	  Car(String model, String manufacturer, String color, double mileage, double fuelTankCapacity) {
		  this.model = model;
		  this.manufacturer = manufacturer;
		  this.color = color;
		  this.mileage = mileage;
		  this.fuelTankCapacity = fuelTankCapacity;
		  this.currentSpeed = 0.0;
<<<<<<< HEAD
		  this.currentFuelLevel = 2.0;
=======
		  this.currentFuelLevel = 0.0;
>>>>>>> 7ebd3c5b29579f0620c4bfee1946ff96323a77d1
		  this.currentDirection = "NORTH";
		  this.odometer = 0.0;
		  this.travelLog = new StringBuilder();
	  }
	  
	  /**
	   * This method makes the car drive in a particular direction
	   * with a speed and a certain distance to be traveled.
	   * @param drivingSpeed
	   * @param drivingDirection
	   * @param distanceTraveled
	   */
	  void drive(double drivingSpeed, String drivingDirection, double distanceTraveled) {
	    currentSpeed = drivingSpeed;
	    currentDirection = drivingDirection;
	    // See how much gas is currently present
	    double gasCurrent = fuelTankCapacity * currentFuelLevel;
	    double gasConsumed = distanceTraveled / mileage;
	    gasCurrent = gasCurrent - gasConsumed;
	    currentFuelLevel = gasCurrent / fuelTankCapacity;
	    this.odometer = this.odometer + distanceTraveled;
	    
	    this.travelLog.append("Direction driven in: " + drivingDirection + ", Distance traveled: " + distanceTraveled + "\n");
	  }
	  
	  void park() {
		  this.currentSpeed = 0.0;
		  System.out.println("The car has been parked!");
	  }
	  
	  void turn(String turnDirection) {
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
	  }
	  
	  void refuel() {
		  park();
		  this.currentFuelLevel = 1.0;
		  System.out.println("The car has been refueled!");
	  }

	  String getModel() {
	    return model;
	  }
	  
	  public static void main(String[] args) {
		  /*
	    Car myCar = new Car();
	    myCar.manufacturer = "Smart";
	    myCar.model = "Fortwo";
	    myCar.color = "grey";
	    myCar.mileage = 35;
	    myCar.fuelTankCapacity = 10;
	    System.out.println(myCar.getModel());
	    myCar.currentFuelLevel = 1;
	    myCar.drive(50, "west", 20);
	    */
		Car myCar = new Car("Fortwo", "Smart", "grey", 35, 10);
		System.out.println(myCar.model);
		myCar.drive(50,  "WEST",  20);
		System.out.println(myCar.currentFuelLevel);
		myCar.refuel();
		System.out.println(myCar.currentFuelLevel);
		myCar.drive(60, "EAST", 100);
		System.out.print(myCar.travelLog.toString());
	  }

}
