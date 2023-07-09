class Oil{
	String brand;
	int price;
	int quantity;
	String color;
	boolean goodBrand;
	Oil(String brand,int price,int quantity,String color,boolean goodBrand)
	{
		System.out.println("Details of oil");
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		this.color=color;
		this.goodBrand=goodBrand;
	}
	void getOil()
	{
		System.out.println("Brand of oil is : "+brand);
		System.out.println("Price of oil is : "+price);
		System.out.println("Quantity of oil is : "+quantity);
		System.out.println("Color of oil is : "+color);
		System.out.println("Is it a good brand : "+goodBrand);
	}
}
	