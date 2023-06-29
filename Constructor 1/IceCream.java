class IceCream{
	String flavour="Butterscotch";
	boolean expired;
	byte price;
	double height=7.5;
	IceCream()
	{
		System.out.println("Let's got to have ice cream");
	}
}
class IceCreamRunner
{
	public static void main(String[] args)
	{
	System.out.println("Ice cream");
	IceCream iceCream=new IceCream();
	System.out.println(iceCream.flavour);
	System.out.println(iceCream.price);
	System.out.println(iceCream.expired);
	System.out.println(iceCream.height);
}
}
	