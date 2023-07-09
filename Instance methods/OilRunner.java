class OilRunner{
	public static void main(String[] args)
	{
	System.out.println("Running main");
	Oil oil=new Oil("Castrol",1000,3,"red",true);
	oil.getOil();
	System.out.println("Updating details");
	oil.brand="Veedol";
	oil.price=15000;
	oil.quantity=2;
	oil.color="Orange";
	oil.goodBrand=false;
	oil.getOil();
	
	
	}
}