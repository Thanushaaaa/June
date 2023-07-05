class Scissors
{
	String brand="Fiskars";
	String color="Black";
	String type="Embroidery";
	String usage="Opening packages";
	char size=3;
	double price=100;
	String material="Steel";

	Scissors()
	{
		System.out.println("Running Const");
	}
	Scissors(String brand)
	{
		System.out.println("Running String : "+brand);
		this.brand=brand;
	}
	Scissors(char size)
	{
		System.out.println("Running char : "+size);
		this.size=size;
	}
	Scissors(double price)
	{
		System.out.println("Runninng double const in Scissors : "+price);
		this.price=price;
	}
	Scissors(String color,char size)
	{
		System.out.println("Running String,Char");
		this.color=color;
		this.size=size;
	}
	Scissors(String type,double price)
	{
		System.out.println("Running String,double");
		this.type=type;
		this.price=price;
	}
	Scissors(String usage,String color,double price)
	{
		System.out.println("Running String,String,double");
		this.usage=usage;
		this.price=price;
		this.color=color;
	}
}
