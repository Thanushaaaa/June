class Money
{
	String country;
	String currency;
	String denomination;
	String type;
	
	Money()
	{
		System.out.println("Money");
	}
	Money(String country,String currency)
	{
		System.out.println("Running String,String");
		this.country=country;
		this.currency=currency;
	}
	Money(String country,String currency,String denomination)
	{
		this(country,currency);
		System.out.println("Running String,String,String");
		this.denomination=denomination;
	}
	Money(String country,String currency,String denomination,String type)
	{
		this(country,currency,denomination);
		System.out.println("Running String,String,String,String");
		this.type=type;
	}
}
	