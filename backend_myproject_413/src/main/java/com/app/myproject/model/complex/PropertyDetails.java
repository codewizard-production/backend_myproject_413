package com.app.myproject.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class PropertyDetails {
  
	
  @Column(name = "\"NoOfBedrooms\"", nullable = true)
  private Integer noOfBedrooms;
	
  @Column(name = "\"NoOfLivingRoom\"", nullable = true)
  private Integer noOfLivingRoom;
	
  @Column(name = "\"OtherSpaces\"", nullable = true)
  private Integer otherSpaces;
	
  @Column(name = "\"NoOfGuests\"", nullable = true)
  private Integer noOfGuests;
	
  @Column(name = "\"ChildrenAllowed\"", nullable = true)
  private Boolean childrenAllowed;
}
