class Apps
{
	String name="Whatsapp";
	int noOfUsers=11;
	String platform="Android";

	Apps()
	{
		System.out.println("Apps");
	}
	Apps(String name)
	{
		System.out.println("Running String : "+name);
		this.name=name;
	}
	Apps(int noOfUsers)
	{
		System.out.println("Running int: "+noOfUsers);
		this.noOfUsers=noOfUsers;
	}
}

