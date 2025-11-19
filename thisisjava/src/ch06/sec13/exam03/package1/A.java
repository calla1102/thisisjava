package ch06.sec13.exam03.package1;

public class A {
	//public 접근 제한을 갖는 필드 선언
	public int field1;
	//default 접근 제한을 갖는 필드 선언
	int field2;
	//private 접근 제한을 갖는 필드 선언
	private int field3;
	
	//생성자 선언
	public A() {
		field1 = 1; //o=> 클래스 내부일 경우 접근제한자의 영향 x
		field2 = 1; //o=> 클래스 내부일 경우 접근제한자의 영향 x
		field3 = 1; //o=> 클래스 내부일 경우 접근제한자의 영향 x
		
		method1(); // //0=> 클래스 내부일 경우 접근제한자의 영향 x
		method2(); // //0=> 클래스 내부일 경우 접근제한자의 영향 x
		method3(); // //0=> 클래스 내부일 경우 접근제한자의 영향 x
	}
	//public 접근 제한을 갖는 메소드 선언
	public void method1() {

	}
	//default 접근 제한을 갖는 메소드 선언
	void method2() {

	}	
	//private 접근 제한을 갖는 메소드 선언
	private void method3() {

	}
}
