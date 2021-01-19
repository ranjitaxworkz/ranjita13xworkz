public class JokerDTO
{
 private String name;
 private String address;
 private long mobileNo;
 
 
 public JokerDTO(String nm,String ad,long mb)
 {
 name=nm;
 address=ad;
 mobileNo=mb;
 }
 
 public String getName()  
 {
 return name;
 }
 public String getAddress()
 {
 return address;
 }
 public long getMobileNo()
 {
 return mobileNo;
 }
    public void setName(String nm)
	{
	name=nm;
	}
	 public void setaAddress(String ad)
	{
	address=ad;
	}
	 public void setMobileNo(long mb)
	{
	mobileNo=mb;
	}
	
	
}
	