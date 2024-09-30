package com.app.myproject.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "UserSchedulesBookings")
@Table(schema = "\"myproject\"", name = "\"UserSchedulesBookings\"")
@Data
public class UserSchedulesBookings{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"UserId\"")
	private Integer userId;

    
    @Column(name = "\"BookingId\"")
    private Integer bookingId;
 
}