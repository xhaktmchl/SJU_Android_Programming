package week03_1;

public class Ex03_03 {
	public static void main(String[] args) {
		
		// 조건문
		//if
		int cnt = 85;
		if(cnt >= 90) {
			System.out.println("합격\n");
		}
		else if(cnt>=80) {
			System.out.println("합격\n");
		}
		else {
			System.out.println("불합격\n");
		}
		
		
		//switch
		int a= (cnt/10)*10;
		switch(a) {
		case 100:
		case 90:
			System.out.println("switch문: 합격\n");
			break;
		case 80:
			System.out.println("switch: 합격\n");
			break;
		default:
			System.out.println("swich: 불합격\n");
		}
		
			
		
	}

}
