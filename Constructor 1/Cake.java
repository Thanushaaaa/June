class Cake
{
	String flavour;
	int price;
	String color="Red";
	double height=4.5;
	Cake()
	{
		System.out.println("There is a bakery near my office");
	}
}
class CakeRunner{
	public static void main(String[] args)
	{
		System.out.println("Cake");
		Cake cake=new Cake();
		System.out.println(cake.flavour);
		System.out.println(cake.price);
		System.out.println(cake.color);
		System.out.println(cake.height);
	}
}
		