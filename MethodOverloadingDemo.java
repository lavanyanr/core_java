package MethodOverloadingDemo;

public class MethodOverloadingDemo {
	void sum(int a,int b) {
		System.out.println("a+b :"+(a+b));
	}
	
	void sum(int m,int n,int o) {
		System.out.println("m+n+o :"+(m+n+o));
	}
	
	void sum(float p, float q) {
		System.out.println("p+q :"+(p+q));
}
public static void main(String[] args) {
	MethodOverloadingDemo mod = new MethodOverloadingDemo();
	
	mod.sum(1.1f, 2.2f);
	mod.sum(1, 2);
	mod.sum(1, 2, 3);
  }
}