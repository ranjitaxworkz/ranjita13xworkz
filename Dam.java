class Dam     
{
  static String name="Hirakud Dam";
  static String location="Sambalpur";
    public static void main(String a[])
	{
System.out.println("Main method started");
System.out.println(name);
System.out.println(location);
barrier();
System.out.println("Main method ended");
	}
	static void barrier()
	{
System.out.println("barrier method started");
System.out.println("Dam stops the flow of water");
System.out.println("barrier method ended");
	}

}