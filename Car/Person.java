package car;

public class Person {
	
	private final String name;
	private final String personalNumber;
	private byte age;
	private boolean isMale;
	private double weight;
	private double money;
	private Car car;
		
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if(money > 0)
			this.money = money;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		if(car != null)
			this.car = car;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0)
			this.weight = weight;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		if(age >= 0)
			this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		if(name != null) {
			return name;
		} else {
			return null;
		}
	}
	
	public String getPersonalNumber() {
		return personalNumber;
	}
	
	public String setPersonalNumber(String personalNumber) {
		if(personalNumber != null && personalNumber.length() == 10) {
			return personalNumber;
		} else {
			return null;
		}
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	public void growUp() {
		this.setAge((byte)(this.getAge() + 1));
	}
	
	public void drinkWater(double liters) {
		if(liters > 1) {
			System.out.println("This is too much water!!!");
		} else {
			System.out.println(this.getName() + " is drinking " + liters + " l. water.");
		}
	}
	
	Person(String name, String personalNumber) {
		this.name = this.setName(name);
		this.personalNumber = this.setPersonalNumber(personalNumber);
		this.setAge((byte)0);
		this.setWeight(4.0);
	}
	
	Person(String name, String personalNumber, byte age, boolean isMale) {
		this(name, personalNumber);
		this.setAge(age);
		this.setIsMale(isMale);
	}
	
	public void buyCar(Car car) {
		if(this.getMoney() >= car.getPrice()) {
			this.car = car;
		}
	}
	
	public double sellForScrap() {
		return (this.getMoney() + this.getCar().calculatePriceForScrap());
	}

}
