class Bread
{
	String ingredient;
	byte price;
	int weight=500;
	String color="Brown";
	Bread()
	{
		System.out.println("Is bread available here?");
	}
}
class BreadRunner
{
	public static void main(String[] args)
	{
		System.out.println("Bread");
		Bread bread=new Bread();
		System.out.println(bread.ingredient);
		System.out.println(bread.price);
		System.out.println(bread.weight);
		System.out.println(bread.color);
	}
}
		
		