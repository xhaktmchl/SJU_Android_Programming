package week03_1;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문
		//int one[] = {0,10,20};
		int one[] = new int[3];
		for(int i=0;i<one.length;i++) {
			one[i] = 10*i;
		}
		
		// for
		String two[] = {"하나","둘","셋"};
		for(String str: two) { // 원소 바로 참조
			System.out.println(str);
		}
		
		// while
		int idx =0;
		while(idx < one.length) {
			System.out.println(one[idx]);
			idx++;
		}

	}

}
