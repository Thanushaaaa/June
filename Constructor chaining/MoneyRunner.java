class MoneyRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main");
		Money money=new Money("USA","Dollars","Gift cards","Crypto
		currency");
		System.out.println("Country :"+money.country);
		System.out.println("Currency :"+money.currency);
		System.out.println("Denomination :"+money.denomination);
		System.out.println("Type :"+money.type);
	}
}
		