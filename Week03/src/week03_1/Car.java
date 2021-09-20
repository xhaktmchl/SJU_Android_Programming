package week03_1;

public class Car {
	// 멤버변수
	String color;
	int speed = 0;
	static int carCount = 0; // 정적 필드
	final static int MAXSPEED=200; // 상수필드
	final static int MINSPEED=0;

	//생성자
	Car(){ };
	
	Car(String color,int speed){
		this.color = color;
		this.speed = speed;
		carCount++; // 정적변수는 클래스 내에서 바로 사용가능
	}
	
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
	
	//정적 메소드
	static int currentCarCount() {
		return carCount; // static 변수 바로 반환
	}

}
