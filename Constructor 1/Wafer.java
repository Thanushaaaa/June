class Wafer{
	boolean crispy;
	boolean sweet=true;
	double length=6.5;
	int cost=500;
	Wafer()
	{
		System.out.println("He likes wafers");
	}
}
class WaferRunner{
	public static void main(String[] args)
	{
		System.out.println("Wafers");
		Wafer wafer=new Wafer();
		System.out.println(wafer.crispy);
		System.out.println(wafer.sweet);
		System.out.println(wafer.length);
		System.out.println(wafer.cost);
	}
}