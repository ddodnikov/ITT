package car;

public class Car {
	
	private final String model;
	private final double maxSpeed;
	private double currentSpeed = 0;
	private String color;
	private byte currentGear = 1;
	private Person owner;
	private double price = 0;
	private boolean isSportCar;
		
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price >= 0)
			this.price = price;
	}

	public boolean getIsSportCar() {
		return isSportCar;
	}

	public void setIsSportCar(boolean isSportCar) {
		this.isSportCar = isSportCar;
	}

	public String getModel() {
		return model;
	}
	
	public String setModel(String model) {
		if(model != null) {
			return model;
		} else {
			return null;
		}
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		if(currentSpeed >= 0 && currentSpeed <= this.getMaxSpeed())
			this.currentSpeed = currentSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color != null)
			this.color = color;
	}
	public byte getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(byte currentGear) {
		if(currentGear >= 0)
			this.currentGear = currentGear;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setOwner(Person owner) {
		if(owner != null)
			this.owner = owner;
	}
	
	public Person getOwner() {
		return this.owner;
	}

	Car(String model, boolean isSportCar, String color, double maxSpeed, double currentSpeed, byte currentGear) {
		this(model, isSportCar, color, maxSpeed);
		this.setCurrentSpeed(currentSpeed);
		this.setCurrentGear(currentGear);
	}
	
	Car(String model, boolean isSportCar, String color , double maxSpeed) {
		this.model = this.setModel(model);
		this.setIsSportCar(isSportCar);
		this.setColor(color);
		this.maxSpeed = maxSpeed;
	}
	
	public void accelerate() {
		this.setCurrentSpeed(this.getCurrentSpeed() + 1);
	}
	
	public void changeGearUp() {
		if(this.getCurrentGear() < 5)
			this.setCurrentGear((byte)(this.getCurrentGear() + 1));
	}
	
	public void changeGearDown() {
		if(this.getCurrentGear() > 1)
			this.setCurrentGear((byte)(this.getCurrentGear() - 1));
	}
	
	public void changeGear(byte newGear) {
		if(newGear > 0 && newGear < 6)
			this.setCurrentGear(newGear);
	}
	
	public void changeColor(String newColor) {
		if(newColor != null)
			this.setColor(newColor);
	}
	
	public boolean isMoreExpensive(Car car) {
		if(this.getPrice() > car.getPrice()) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calculatePriceForScrap() {
		double coef = 0.2;
		if(this.getColor() == "white" || this.getColor() == "black") {
			coef += 0.05;
		}
		if(this.getIsSportCar() == true) {
			coef += 0.05;
		}
		return coef*this.getPrice();
	}
	
	public void changeOwner(Person newOwner) {
		if(newOwner != null) {
			this.setOwner(newOwner);
		}
	}
	
	public void showCarInfo() {
		System.out.println("Car information : ");
		System.out.println("Model : " + this.getModel());
		System.out.println("Color : " + this.getColor());
		System.out.println("Max speed : " + this.getMaxSpeed());
		System.out.println("Sport car : " + this.getIsSportCar());
		System.out.println("Price : " + this.getPrice());
	}
	
}
