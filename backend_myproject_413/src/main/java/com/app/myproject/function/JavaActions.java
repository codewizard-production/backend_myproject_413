package com.app.myproject.function;

import com.app.myproject.model.Review;
import com.app.myproject.model.Host;
import com.app.myproject.model.Property;
import com.app.myproject.model.Payment;
import com.app.myproject.model.Accommodation;
import com.app.myproject.model.Booking;
import com.app.myproject.model.User;
import com.app.myproject.model.Document;




import com.app.myproject.model.complex.PropertyDetails;
import com.app.myproject.enums.General;
import com.app.myproject.enums.PaymentMode;
import com.app.myproject.enums.BookingStatus;
import com.app.myproject.converter.BookingStatusConverter;
import com.app.myproject.converter.PaymentModeConverter;
import com.app.myproject.converter.GeneralConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  