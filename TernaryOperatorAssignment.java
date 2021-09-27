class TernaryOperatorAssignment{
public static void main(String[] args){
int a=50;
int b=100;
int c=150;
int result=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("largest number is:" +result);
int result1=c<(a<b?a:b)?c:((a<b)?a:b);
System.out.println("Smallest number is:" +result1);
}
}