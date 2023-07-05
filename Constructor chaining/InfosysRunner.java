class InfosysRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Infosys infosys=new Infosys("Narayana murthi","Sudha murthy",1981,15000000);
		System.out.println("FounderName :"+infosys.founderName);
		System.out.println("FounderWifeName :"+infosys.founderWifeName);
		System.out.println("Founded :"+infosys.founded);
		System.out.println("NoOfEmployees :"+infosys.noOfEmployees);
	}
}