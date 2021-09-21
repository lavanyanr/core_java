class Vehicle{
   String name;
   String color;
   int noOfGears;
   
   void trans(){
      System.out.println(color+" "+name+" is a transport machine...!");
   }
    void lessTra(){
      System.out.println(color+" "+name+" is lesser traffic congestion...!");
   }

     public static void main(String[] args){
      
     Vehicle cycle = new Vehicle();
     cycle.name = "Cycle";
     cycle.color = "Blue";
     cycle.noOfGears = 3;

     cycle.trans();
     cycle.lessTra();
   }
}