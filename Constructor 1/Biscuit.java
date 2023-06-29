class Biscuit{
	int price;
	String shape="Rectangle";
	double length;
	double width=4.2;
	Biscuit()
	{
		System.out.println("I am going to buy biscuits");
	}
}
class BiscuitRunner{
	public static void main(String[] args)
	{
	System.out.println("Biscuit");
	Biscuit biscuit=new Biscuit();
	System.out.println(biscuit.price);
	System.out.println(biscuit.shape);
	System.out.println(biscuit.length);
	System.out.println(biscuit.width);
	}
}
	