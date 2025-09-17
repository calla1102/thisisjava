package ch02.sec11;

public class VariableScopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1-10;
			int v3 = v1+v2+5;
		}
		//int v3 = v1+v2+5; 중괄호 밖에 두면 오류남 -> v2변수를 사용할 수 없기 때문에

	}

}
