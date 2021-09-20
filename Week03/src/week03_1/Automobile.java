package week03_1;

public class Automobile extends Car{ // Car 상위 클래스 상속받음
	
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	// 메소드
	// 상속받은 메소드 재정의
	void upSpeed(int value) {
		if(speed + value >= 300) {
			speed = 300;
		}
		else {
			speed += value;
		}
	}

}
