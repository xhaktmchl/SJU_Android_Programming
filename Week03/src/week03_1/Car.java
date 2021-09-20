package week03_1;

public class Car {
	// �������
	String color;
	int speed = 0;
	static int carCount = 0; // ���� �ʵ�
	final static int MAXSPEED=200; // ����ʵ�
	final static int MINSPEED=0;

	//������
	Car(){ };
	
	Car(String color,int speed){
		this.color = color;
		this.speed = speed;
		carCount++; // ���������� Ŭ���� ������ �ٷ� ��밡��
	}
	
	// �޼ҵ�
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
	
	//���� �޼ҵ�
	static int currentCarCount() {
		return carCount; // static ���� �ٷ� ��ȯ
	}

}
