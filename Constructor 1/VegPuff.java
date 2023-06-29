class VegPuff{
	String ingredient;
	int price=300;
	boolean fresh;
	double weight=8.0;
	VegPuff()
	{
		System.out.println("This shop is famous for its veg puff");
	}
}
class VegPuffRunner
{
	public static void main(String[] args)
	{
		System.out.println("veg puff");
		VegPuff vegPuff=new VegPuff();
		System.out.println(vegPuff.ingredient);
		System.out.println(vegPuff.price);
		System.out.println(vegPuff.fresh);
		System.out.println(vegPuff.weight);
	}
}
		
	