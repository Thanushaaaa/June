class Sweet
{
	String name;
	int price=200;
	String color="white";
	String mainIngredient;
	Sweet()
	{
		System.out.println("He went to a shop");
	}
}
class SweetRunner{
	public static void main(String[] args)
	{
		System.out.println("Sweet");
		Sweet sweet=new Sweet();
		System.out.println(sweet.name);
		System.out.println(sweet.price);
		System.out.println(sweet.color);
		System.out.println(sweet.mainIngredient);
	}
}
		