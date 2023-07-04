class FishRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main method");
		Fish fish=new Fish();
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		Fish dolphins=new Fish("Carp");
		System.out.println(dolphins.name);
		System.out.println(dolphins.type);
		System.out.println(dolphins.price);
		System.out.println(dolphins.location);
		Fish bass=new Fish(900);
		System.out.println(bass.name);
		System.out.println(bass.type);
		System.out.println(bass.price);
		System.out.println(bass.location);
		Fish fish1=new Fish("Perch",500);
		System.out.println(fish1.name);
		System.out.println(fish1.type);
		System.out.println(fish1.price);
		System.out.println(fish1.location);
	}
}
		
		
		
		