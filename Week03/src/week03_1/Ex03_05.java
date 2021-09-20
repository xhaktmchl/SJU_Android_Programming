package week03_1;

public class Ex03_05 {
	static int var = 100; // 전역변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0; // 지역변수
		System.out.println(var);
		
		int sum = add(10,20);
		System.out.println(sum);

	}
	
	static int add(int n1,int n2) {
		return n1+n2+var; // 여기 var은 전역
	}

}
