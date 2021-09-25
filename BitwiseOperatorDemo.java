class BitwiseOperatorDemo{

public static void main(String[] args){
  
        int p = 9;
        int q = 8;

        System.out.println(p>q & ++p<q);
        
        System.out.println("p :"+p);

        System.out.println(p!=q | q++ !=p);

        System.out.println("q :"+q);


}
}