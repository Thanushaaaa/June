class MetroRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Metro metro=new Metro("Blue",20,"Rajajinagar","hebbal",20000);
		System.out.println(metro.line);
		System.out.println(metro.distance);
		System.out.println(metro.start);
		System.out.println(metro.destination);
		System.out.println(metro.capacity);
	}
}