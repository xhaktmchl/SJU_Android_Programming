package week03_1;

public class Car {
	// 멤버변수
	String color;
	int speed = 0;
	
	
	
	// 메소드
	int getSpeed() {
		return speed;
	}
	
	void upSpeed(int value) {
		if(speed + value >=200) {
			speed = 200;
		}
		else {
			speed+= value;
		}
	}
	
	void downSpeed(int value) {
		if(speed - value <0) {
			speed = 0;
		}
		else {
			speed-= value;
		}
	}
	
	String getColor() {
		return color;
	}

}
