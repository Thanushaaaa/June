class Metro
{
	String line;
	int distance;
	String start;
	String destination;
	long capacity;
	
	Metro()
	{
		System.out.println("Metro");
	}
	Metro(String line,int distance)
	{
		System.out.println("Running String,int");
		this.line=line;
		this.distance=distance;
	}
	Metro(String line,int distance,String start)
	{
		this(line,distance);
		System.out.println("Running String,int,String");
		this.start=start;
	}
	Metro(String line,int distance,String start,String destination)
	{
		this(line,distance,start);
		System.out.println("Running String,int,String,String");
		this.destination=destination;
	}
	Metro(String line,int distance,String start,String destination,long capacity)
	{
		this(line,distance,start,destination);
		System.out.println("Running String,int,String,String,long");
		this.capacity=capacity;
	}
}