class Bar
{
   String name;
   String address;
   
   public void sellingDrinks()
   {
   System.out.println("It is place which serves soft and bottled beer,wine,spirits &cocktail");
   
   }
   
  public static void main(String a[])
  {
  
  Bar b=new Bar();
  b.name="Navarang Bar";
  b.address="Rajajinagar";
  System.out.println(b.name+"\t"+b.address);
  
  
  Bar bb=new Bar();
  bb.name="Shanti Bar";
  bb.address="RRnagar";
  System.out.println(bb.name+"\t"+bb.address);
  b.sellingDrinks();
  
  }
}
 