package week03_1;

public class Ex03_03 {
	public static void main(String[] args) {
		
		// ���ǹ�
		//if
		int cnt = 85;
		if(cnt >= 90) {
			System.out.println("�հ�\n");
		}
		else if(cnt>=80) {
			System.out.println("�հ�\n");
		}
		else {
			System.out.println("���հ�\n");
		}
		
		
		//switch
		int a= (cnt/10)*10;
		switch(a) {
		case 100:
		case 90:
			System.out.println("switch��: �հ�\n");
			break;
		case 80:
			System.out.println("switch: �հ�\n");
			break;
		default:
			System.out.println("swich: ���հ�\n");
		}
		
			
		
	}

}
