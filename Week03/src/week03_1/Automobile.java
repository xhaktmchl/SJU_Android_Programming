package week03_1;

public class Automobile extends Car{ // Car ���� Ŭ���� ��ӹ���
	
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	// �޼ҵ�
	// ��ӹ��� �޼ҵ� ������
	void upSpeed(int value) {
		if(speed + value >= 300) {
			speed = 300;
		}
		else {
			speed += value;
		}
	}

}
