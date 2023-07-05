class Infosys
{
	String founderName;
	String founderWifeName;
	int founded;
	long noOfEmployees;
	
	Infosys()
	{
		System.out.println("Infosys");
	}
	Infosys(String founderName)
	{
		System.out.println("Running String");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName,int founded)
	{
		this(founderName);
		System.out.println("Running String,String,int");
		this.founderWifeName=founderWifeName;
		this.founded=founded;
	}
	Infosys(String founderName,String founderWifeName,int founded,long noOfEmployees)
	{
		this(founderName,founderWifeName,founded);
		System.out.println("Running String,String,int,long Const");
		this.noOfEmployees=noOfEmployees;
	}
}
	