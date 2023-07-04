class ScissorsRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main");
		Scissors scissors=new Scissors();
		System.out.println(scissors.brand);
		System.out.println(scissors.color);
		System.out.println(scissors.type);
		System.out.println(scissors.usage);
		System.out.println(scissors.size);
		System.out.println(scissors.material);
		System.out.println(scissors.price);

		Scissors good=new Scissors();
		System.out.println(good.brand);
		System.out.println(good.color);
		System.out.println(good.type);
		System.out.println(good.usage);
		System.out.println(good.size);
		System.out.println(good.material);
		System.out.println(good.price);

		Scissors thin=new Scissors(4);
		System.out.println(thin.brand);
		System.out.println(thin.color);
		System.out.println(thin.type);
		System.out.println(thin.usage);
		System.out.println(thin.size);
		System.out.println(thin.material);
		System.out.println(thin.price);

		Scissors cloth=new Scissors(70);
		System.out.println(cloth.brand);
		System.out.println(cloth.color);
		System.out.println(cloth.type);
		System.out.println(cloth.usage);
		System.out.println(cloth.size);
		System.out.println(cloth.material);
		System.out.println(cloth.price);

		Scissors metal=new Scissors("red",7);
		System.out.println(metal.brand);
		System.out.println(metal.color);
		System.out.println(metal.type);
		System.out.println(metal.usage);
		System.out.println(metal.size);
		System.out.println(metal.material);
		System.out.println(metal.price);

		Scissors tool=new Scissors("Tailor",50);
		System.out.println(tool.brand);
		System.out.println(tool.color);
		System.out.println(tool.type);
		System.out.println(tool.usage);
		System.out.println(tool.size);
		System.out.println(tool.material);
		System.out.println(tool.price);

		Scissors blade=new Scissors();
		System.out.println(blade.brand);
		System.out.println(blade.color);
		System.out.println(blade.type);
		System.out.println(blade.usage);
		System.out.println(blade.size);
		System.out.println(blade.material);
		System.out.println(blade.price);
	}
}
