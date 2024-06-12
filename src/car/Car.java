package car;

public class Car {
	// protected String company = "weniv";

	private int speed;
	private int gear;

	private String wheel;
	private int cc;
	private String logo;
	private String engine;

	public double getSpeed() {
		return this.speed * 1.6;
	}

	public int getGear() {
		return gear;
	}

	public String getWheel() {
		return wheel;
	}

	public int getCc() {
		return cc;
	}

	public String getLogo() {
		return logo;
	}

	public String getEngine() {
		return engine;
	}

	public Car(int gear) {
		this.speed = 0;
		this.gear = gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setSpeed(int speed) { // 설정자
		this.speed = speed;

		if (speed > 0 && speed <= 30) {
			if (gear != 1) {
				this.gear = 1;
			}
		}

		if (speed > 30 && speed <= 70) {
			if (gear != 2) {
				this.gear = 2;
			}
		}

		if (speed > 70 && speed <= 120) {
			if (gear != 3) {
				this.gear = 3;
			}
		}

		System.out.println("현재 속력: " + this.speed);
		System.out.println("현재 기어: " + this.gear);

		/* 강사님 솔루션
		if (speed < 0) {
			this.speed = 0;
			return;
		}
		this.speed = speed;

		if (speed <= 30) {
			this.gear = 1;
		} else if (speed <= 70) {
			this.gear = 2;
		} else {
			this.gear = 3;
		}
		*/
	}

	public void checkSpeed() {
		System.out.println(this.speed);
	}

	public static void main(String[] args) {
		Car car = new Car(2);

		car.setSpeed(25);
		car.setSpeed(40);
		car.setSpeed(120);
		// car.checkSpeed();
	}
}