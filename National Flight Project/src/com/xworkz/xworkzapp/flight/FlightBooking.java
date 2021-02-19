package com.xworkz.xworkzapp.flight;

public class FlightBooking {

	public FlightBookingDTO[] flightBookingDTO;
	private int index;

	public FlightBooking (int size) {
		flightBookingDTO = new FlightBookingDTO[size];
	}
	
	public void flightInformation(FlightBookingDTO flightBookingDTO) {
		this.flightBookingDTO[index++] = flightBookingDTO;
	}
	
	public void getFlightBookingDetails() {
		for (int i = 0; i < flightBookingDTO.length; i++) {
			

			System.out.println(flightBookingDTO[i].getAiroplaneCode()+" "+flightBookingDTO[i].getCompany()+" "+
					flightBookingDTO[i].getStartingPoint()+" "+flightBookingDTO[i].getDestination()+" "+
					flightBookingDTO[i].getTotalSeats()+" "+flightBookingDTO[i].getDomestic()+" "+
					flightBookingDTO[i].getBusinessClassPrice()+" "+flightBookingDTO[i].getEconomicClassprice());
		}
	}

     public void acceptFlightBookingDetails(FlightBookingDTO flightBookingDTO) {
		if (flightBookingDTO.getAiroplaneCode() != null && flightBookingDTO.getCompany() !=null
				&& flightBookingDTO.getBusinessClassPrice() >=0.0 && flightBookingDTO.getStartingPoint() !=null
				&& flightBookingDTO.getBusinessClassPrice()<=1000)
			
		{
	       System.out.println("allow to book");
		} else {
			System.out.println("booking not allow");
		}

	}
     
     public void searchStartingPoint(String startingPoint ) {
    	 for (int i = 0; i < flightBookingDTO.length; i++) {
    	 	 
    	    if(flightBookingDTO[i].getStartingPoint().equals(startingPoint)) {
    	    	
    	   System.out.println(flightBookingDTO[i].getAiroplaneCode()+" "+flightBookingDTO[i].getCompany()+" "+
    					flightBookingDTO[i].getStartingPoint()+" "+flightBookingDTO[i].getDestination()+" "+
    					flightBookingDTO[i].getTotalSeats()+" "+flightBookingDTO[i].getDomestic()+" "+
    					flightBookingDTO[i].getBusinessClassPrice()+" "+flightBookingDTO[i].getEconomicClassprice());
    	    	
    	    } else {
    	    	System.out.println("starting point not found");
    	    }
     }
     }
   
	
}
