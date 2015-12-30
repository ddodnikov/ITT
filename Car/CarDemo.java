package car;

public class CarDemo {

	public static void main(String[] args) {
		
		Person mitko = new Person("Mitko", "9111013484", (byte)24, true);
		Person petya = new Person("Petya", "8908063492", (byte)26, false);
		
		CarShop carShop = new CarShop(5);
		
		Car car1 = new Car("Opel Vectra", false, "grey", 180);
		Car car2 = new Car("BMW X5", false, "black", 260);
		Car car3 = new Car("Mercedes CL200", false, "white", 250);
		Car car4 = new Car("VW golf2", false, "black", 160);
		Car car5 = new Car("BMW X1", false, "blue", 270);
		Car car6 = new Car("BMW X6", false, "green", 300);
		
		carShop.addCar(car1);
		carShop.addCar(car2);
		carShop.addCar(car3);
		carShop.addCar(car4);
		carShop.addCar(car5);
		carShop.addCar(car6);
		
		carShop.showAllCarsInTheShop();
		
		carShop.getNextCar();
		carShop.getNextCar();
		
		carShop.getCars()[carShop.getCarCount()].showCarInfo();
		
		carShop.sellNextCar(mitko);
		
		System.out.println(mitko.getCar().getModel());
		carShop.showAllCarsInTheShop();
		
		carShop.addCar(car6);
		carShop.showAllCarsInTheShop();
		
		mitko.getCar().showCarInfo();
		
	}
	
}
