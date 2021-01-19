public class CafeDTO
{
 private String name;
 private String address;
 private int noOfWorkers;
 private int id;

 public CafeDTO(String nm,String ad,int wrk,int i)
 {
 name=nm;
 address=ad;
 noOfWorkers=wrk;
 id=i;
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
    public int getId()
	{
	return id;
	}

}












