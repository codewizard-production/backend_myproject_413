package com.app.myproject.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum BookingStatus{
	    Reserved,
	    Booked,
	    Cancelled,
	    Completed; 
    public int value(BookingStatus bookingStatus) {
        return bookingStatus.ordinal();
    }
    public static BookingStatus getBookingStatus(int ordinal) {
        for(BookingStatus bookingStatus : BookingStatus.values())
                if(bookingStatus.ordinal() == ordinal)
                        return bookingStatus;
        return null;
    }
}


