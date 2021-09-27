class ShiftOperatorAssignment{
public static void main(String[] args){
byte x,y;
x=20;
y=30;
System.out.println("Bitwise left shift:x<<2 = "+(x<<2));
System.out.println("Bitwise right shift:x>>2 = "+(x>>2));
System.out.println("Bitwise zerofill rightshift:x>>>2 = "+(x>>>2));
System.out.println("Bitwise zerofill rightshift:y>>>2 = "+(y>>>2));
}
}