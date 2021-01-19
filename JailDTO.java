public class JailDTO
{
 private String name;
 private String address;
 
 public JailDTO(String nm,String aa)
 {
 name=nm;
 address=aa;
 }
 
 public String getName()  
 {
 return name;
 }
   public String getAddress()  
   {
   return address;
   }
public void setName(String nm)
{
name=nm;
}
public void setAddress(String aa)
{
address=aa;
}

}