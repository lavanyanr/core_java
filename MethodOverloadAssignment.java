package MethodOverloadAssignment;

public class MethodOverloadAssignment {
	void add(int s,int t) {
		System.out.println("s+t :"+(s+t));
	}
	
	void add(int m,int n,int o) {
		System.out.println("m+n+o :"+(m+n+o));
	}
	
	void add(float r, float t) {
		System.out.println("r+t :"+(r+t));
}
public static void main(String[] args) {
	MethodOverloadAssignment mod = new MethodOverloadAssignment();
	
	mod.add(4.22f, 2.58f);
	mod.add(10, 22);
	mod.add(1, 9, 5);
  }
}