class Chocolate{
	String shape;
	byte cost=100;
	String color="Brown";
	double length;
	Chocolate()
	{
		System.out.println("He gave a chocolate to his girlfriend");
	}
}
class ChocolateRunner{
	public static void main(String[] args)
	{
		System.out.println("Chocolate");
		Chocolate chocolate=new Chocolate();
		System.out.println(chocolate.shape);
		System.out.println(chocolate.cost);
		System.out.println(chocolate.color);
		System.out.println(chocolate.length);
	}
}
	