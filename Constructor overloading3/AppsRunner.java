class AppsRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main");
		Apps apps=new Apps();
		System.out.println(apps.name);
		System.out.println(apps.noOfUsers);
		System.out.println(apps.platform);
		Apps space=new Apps("Instagram");
		System.out.println(space.name);
		System.out.println(space.noOfUsers);
		System.out.println(space.platform);
		Apps price=new Apps(15);
		System.out.println(price.name);
		System.out.println(price.noOfUsers);
		System.out.println(price.platform);
	}
}