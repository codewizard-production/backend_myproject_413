package com.app.myproject.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum General{
	    AirConditioning,
	    FreeWifi,
	    Heating,
	    EVCharigng,
	    Kitchen,
	    Balcony,
	    TV,
	    Terrace,
	    Other; 
    public int value(General general) {
        return general.ordinal();
    }
    public static General getGeneral(int ordinal) {
        for(General general : General.values())
                if(general.ordinal() == ordinal)
                        return general;
        return null;
    }
}


