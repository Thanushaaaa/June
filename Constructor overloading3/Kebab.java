class Kebab
{
	String name;
	double price=300;
	String hotelName="Dolphins";
	int noOfPieces=30;
	boolean takeAway;
	Kebab()
	{
		System.out.println("Kebab");
	}
	Kebab(String name)
	{
		System.out.println("Running String"+name);
		this.name=name;
	}
	Kebab(double price)
	{
		System.out.println("Running double"+price);
		this.price=price;
	}
	Kebab(String hotelName,int noOfPieces)
	{
		System.out.println("Runnning String,int");
		this.hotelName=hotelName;
		this.noOfPieces=noOfPieces;
	}
	Kebab(boolean takeAway)
	{
		System.out.println("Running boolean"+takeAway);
		this.takeAway=takeAway;
	}
}