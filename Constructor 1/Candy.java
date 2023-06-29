class Candy{
	String color="blue";
	byte price;
	String flavour="Strawberry";
	boolean tasty;
	Candy()
	{
		System.out.println("She likes pink candies ^_^");
	}
}
class CandyRunner{
	public static void main(String[] args)
	{
		System.out.println("Candy");
		Candy candy=new Candy();
		System.out.println(candy.color);
		System.out.println(candy.price);
		System.out.println(candy.flavour);
		System.out.println(candy.tasty);
	}
}
		