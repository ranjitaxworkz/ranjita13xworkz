class Restuarant
{
   String id;
   String name;
   String address;
   
   public void eat()
 {
 System.out.println("eating schezwan noodles");
 }

 public static void main(String a[])
 {
   Restuarant rs=new Restuarant();
   rs.id="DERT456";
   rs.name="Kadamba";
   rs.address="Malleshwaram";
  System.out.println(rs.id+"\t"+rs.name+"\t"+rs.address);
 
 Restuarant rest=new Restuarant();
   rest.id="78R9";
   rest.name="saptagiri";
   rest.address="kalburgi";
  System.out.println(rest.id+"\t"+rest.name+"\t"+rest.address);
  rs.eat();
 }
}