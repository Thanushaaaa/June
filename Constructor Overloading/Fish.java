class Fish
{
	String name="Star fish";
	String type="Shark";
	int price=1000;
	String location="Pacific ocean";
	Fish()
	{
		System.out.println("Fish");
	}
	Fish(String name)
	{
		System.out.println("Running with string"+name);
		this.name=name;
	}
	Fish(int price)
	{
		System.out.println("Running with int"+price);
		this.price=price;
	}
	Fish(String type,int price)
	
	{
		System.out.println("Running with string and int");
		this.type=type;
		this.price=price;
	}
}
		