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

@Entity(name = "Property")
@Table(name = "\"Property\"", schema =  "\"myproject\"")
@Data
                        
public class Property {
	public Property () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PropertyId\"", nullable = true )
  private Integer propertyId;
	  
  @Column(name = "\"PropertyName\"", nullable = true )
  private String propertyName;
  
	  
  @Column(name = "\"Country\"", nullable = true )
  private String country;
  
	  
  @Column(name = "\"PropertyType\"", nullable = true )
  private String propertyType;
  
	  
  @Column(name = "\"PricePerNight\"", nullable = true )
  private Float pricePerNight;
  
	  
  @Column(name = "\"City\"", nullable = true )
  private String city;
  
	  
  @Column(name = "\"PostCode\"", nullable = true )
  private String postCode;
  
	  
  @Column(name = "\"StreetName\"", nullable = true )
  private String streetName;
  
	  
  @Column(name = "\"Location\"", nullable = true )
  private String location;
  
	  
  @Column(name = "\"PropertySize\"", nullable = true )
  private String propertySize;
  
	  
  @Column(name = "\"Availability\"", nullable = true )
  private Boolean availability;
  
	  
  @Embedded
  @Column(name = "\"Details\"")
  @AttributeOverrides({
            	@AttributeOverride(name = "noOfBedrooms", column = @Column(name = "\"Details_NoOfBedrooms\"")) ,
            	@AttributeOverride(name = "noOfLivingRoom", column = @Column(name = "\"Details_NoOfLivingRoom\"")) ,
            	@AttributeOverride(name = "otherSpaces", column = @Column(name = "\"Details_OtherSpaces\"")) ,
            	@AttributeOverride(name = "noOfGuests", column = @Column(name = "\"Details_NoOfGuests\"")) ,
            	@AttributeOverride(name = "childrenAllowed", column = @Column(name = "\"Details_ChildrenAllowed\""))  }) 
  private PropertyDetails details;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PropertyPropertyReviews\"",
            joinColumns = @JoinColumn( name="\"PropertyId\""),
            inverseJoinColumns = @JoinColumn( name="\"ReviewId\""), schema = "\"myproject\"")
private List<Review> propertyReviews = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PropertyPropertyImages\"",
            joinColumns = @JoinColumn( name="\"PropertyId\""),
            inverseJoinColumns = @JoinColumn( name="\"DocId\""), schema = "\"myproject\"")
private List<Document> propertyImages = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PropertyAccommodationDetails\"",
            joinColumns = @JoinColumn( name="\"PropertyId\""),
            inverseJoinColumns = @JoinColumn( name="\"AccID\""), schema = "\"myproject\"")
private List<Accommodation> accommodationDetails = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Property [" 
  + "PropertyId= " + propertyId  + ", " 
  + "PropertyName= " + propertyName  + ", " 
  + "Country= " + country  + ", " 
  + "PropertyType= " + propertyType  + ", " 
  + "PricePerNight= " + pricePerNight  + ", " 
  + "City= " + city  + ", " 
  + "PostCode= " + postCode  + ", " 
  + "StreetName= " + streetName  + ", " 
  + "Location= " + location  + ", " 
  + "PropertySize= " + propertySize  + ", " 
  + "Availability= " + availability  + ", " 
  + "Details= " + details 
 + "]";
	}
	
}