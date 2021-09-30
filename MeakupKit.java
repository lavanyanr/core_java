class MeakupKit{
	static String name = "lipstick";
	static String brand = "lakme";
	static int lip_price=210;
	static float kajal_price = 130;
	
	public static void main(String []args){
		System.out.println(name);
		System.out.println(brand);
		
		if(lip_price <250){
			
			System.out.println("Purchase lipstick of rs "+ lip_price);
		}else{
                        
		        System.out.println("lipstick was out of range");
                }
		if (kajal_price < 100){
			System.out.println("Purchase kajal of rs "+ kajal_price);
		}else {
			System.out.println("kajal was out of range");
		}
	
	}
}