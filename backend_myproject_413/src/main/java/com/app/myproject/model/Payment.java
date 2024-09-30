package com.app.myproject.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
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
import com.app.myproject.converter.DurationConverter;
import com.app.myproject.converter.UUIDToByteConverter;
import com.app.myproject.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Payment")
@Table(name = "\"Payment\"", schema =  "\"myproject\"")
@Data
                        
public class Payment {
	public Payment () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PaymentId\"", nullable = true )
  private Integer paymentId;
	  
  @Column(name = "\"Amount\"", nullable = true )
  private Float amount;
  
	  
  @Column(name = "\"PaymentDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date paymentDate;  
  
	  
  @Column(name = "\"PaymentMethod\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = PaymentModeConverter.class)
  private PaymentMode paymentMethod;
  
	  
  @Column(name = "\"Status\"", nullable = true )
  private String status;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Payment [" 
  + "PaymentId= " + paymentId  + ", " 
  + "Amount= " + amount  + ", " 
  + "PaymentDate= " + paymentDate  + ", " 
  + "PaymentMethod= " + paymentMethod  + ", " 
  + "Status= " + status 
 + "]";
	}
	
}