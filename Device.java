class Device{
   String name;
   String color;
   int itemid;
   
   void homAppli(){
      System.out.println(color+" "+name+" is a home appliance...!");
   }
    void electro(){
      System.out.println(color+" "+name+" is an elecronics devices...!");
   }

     public static void main(String[] args){
      
     Device refrigerator = new Device();
     refrigerator.name = "xyz";
     refrigerator.color = "black";
     refrigerator.itemid = 123;

     refrigerator.homAppli();
     refrigerator.electro();
   }
}