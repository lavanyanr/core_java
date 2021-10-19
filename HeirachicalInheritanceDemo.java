package heirachical_inheritence;

public class HeirachicalInheritanceDemo {
	public static void main(String[] args) {
	Audi audi = new Audi();
	BMW bmw = new BMW();
	Ferrari ferrari = new Ferrari();
	
	audi.drive();
	audi.speed();
	 
	bmw.drive();
	bmw.speed();
	
	ferrari.drive();
	ferrari.speed();
	}	

}
