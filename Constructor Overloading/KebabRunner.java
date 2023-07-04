class KebabRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Kebab kebab=new Kebab();
		System.out.println(kebab.name);
		System.out.println(kebab.price);
		System.out.println(kebab.hotelName);
		System.out.println(kebab.noOfPieces);
		System.out.println(kebab.takeAway);
		Kebab food=new Kebab("Fish Kebab");
		System.out.println(food.name);
		System.out.println(food.price);
		System.out.println(food.hotelName);
		System.out.println(food.noOfPieces);
		System.out.println(food.takeAway);
		Kebab chicken=new Kebab(200);
		System.out.println(chicken.name);
		System.out.println(chicken.price);
		System.out.println(chicken.hotelName);
		System.out.println(chicken.noOfPieces);
		System.out.println(chicken.takeAway);
		Kebab good=new Kebab("Pearl Hotel",10);
		System.out.println(good.name);
		System.out.println(good.price);
		System.out.println(good.hotelName);
		System.out.println(good.noOfPieces);
		System.out.println(good.takeAway);
		Kebab spicy=new Kebab(true);
		System.out.println(spicy.name);
		System.out.println(spicy.price);
		System.out.println(spicy.hotelName);
		System.out.println(spicy.noOfPieces);
		System.out.println(spicy.takeAway);
	}
}