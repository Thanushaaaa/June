class Bun
{
	String shape;
	double weight=6.7;
	String color="Brown";
	byte cost;
	Bun()
	{
		System.out.println("Let's eat");
	}
}
class BunRunner{
	public static void main(String[] args)
	{
		System.out.println("Bun");
		Bun bun=new Bun();
		System.out.println(bun.shape);
		System.out.println(bun.weight);
		System.out.println(bun.color);
		System.out.println(bun.cost);
	}
}