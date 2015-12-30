package car;

public class CarShop {
	
	private Car[] cars;
	private int carCount = -1;
	
	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		if(cars != null)
			this.cars = cars;
	}
	
	public void setCarCount(int newCarCount) {
		this.carCount = newCarCount;
	}
	
	public int getCarCount() {
		return this.carCount;
	}

	CarShop(int capacity) {
		this.cars = new Car[capacity];
	}
	
	public void addCar(Car car) {
		if(car != null) {
			for(int index = 0; index < this.getCars().length; index++) {
				if(this.getCars()[index] == null) {
					this.getCars()[index] = car;
					break;
				}
			}
		}
	}
	
	public Car getNextCar() {
		this.setCarCount(this.getCarCount() + 1);
		if(this.getCarCount() < this.getCars().length) {
			return this.getCars()[this.getCarCount()];
		} else {
			System.out.println("No more cars in the shop.");
			return (new Car(null, false, null, 0));
		}
	}
	
	public void sellNextCar(Person buyer) {
		if(buyer != null) {
			buyer.buyCar(this.getNextCar());
			this.removeCar(this.getNextCar());
		}
	}
	
	public void removeCar(Car car) {
		this.getCars()[this.getCarCount()-1] = null;
	}

	public void showAllCarsInTheShop() {
		System.out.println("Cars in the shop : ");
		for(int index = 0; index < this.getCars().length; index++) {
			if(this.getCars()[index] != null) {
				System.out.println((index+1) + ". " + this.getCars()[index].getModel());
			} else {
				System.out.println((index+1) + ". Sold car" );
			}
		}
	}
}
