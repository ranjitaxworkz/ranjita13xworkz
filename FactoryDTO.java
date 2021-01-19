public class FactoryDTO
{
  
 private String name;
 private String address;
 private int noOfWorkers;
 
 public FactoryDTO(String nm,String ad,int work)
 {
 name=nm;
 address=ad;
 noOfWorkers=work;
 }
 
 public String getName()  
 {
 return name;
 }
   public String getAddress()  
   {
   return address;
   }
 public int getNoOfWorkers()
 {
 return noOfWorkers;
 }
     public void setName(String nm)
    {
    name=nm;
    }
    public void setAddress(String ad)
   {
     address=ad;
   }
   public void setNoOfWorkers(int work)
   {
   noOfWorkers=work;
   }

}



