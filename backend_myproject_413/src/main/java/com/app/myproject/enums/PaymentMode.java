package com.app.myproject.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum PaymentMode{
	    CreditCard,
	    DebitCard,
	    Cash,
	    BankTransfer,
	    UPI; 
    public int value(PaymentMode paymentMode) {
        return paymentMode.ordinal();
    }
    public static PaymentMode getPaymentMode(int ordinal) {
        for(PaymentMode paymentMode : PaymentMode.values())
                if(paymentMode.ordinal() == ordinal)
                        return paymentMode;
        return null;
    }
}


