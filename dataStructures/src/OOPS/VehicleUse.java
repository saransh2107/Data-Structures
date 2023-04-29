package OOPS;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v= new Vehicle();
		v.setColor("Red");
		v.print();

		Car c= new Car();
		c.setColor("Black");
		c.setMaxSpeed(100);
		c.numDoors= 4;
		c.print();

		Bicycle b= new Bicycle();
		b.print();

	}

}
class Vehicle{

	private String color;
	private int maxSpeed;

	public void print(){
		System.out.println("Vehicle "+ " color "+ getColor()+" maxSpeed "+ getMaxSpeed());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}



class Car extends Vehicle{

	int numDoors;
}



class Bicycle extends Car{

	String color;
	int maxSpeed;
}
