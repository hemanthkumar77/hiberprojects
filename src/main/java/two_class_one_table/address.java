package two_class_one_table;

import javax.annotation.Generated;
import javax.persistence.*;
@Embeddable
@Table(name="student_address")
public class address {

@Column(name="street_address",nullable=true,columnDefinition="varchar(36)")
private String street;
@Column(name="state",nullable=true,columnDefinition="varchar(21)")
private String state;
@Column(name="city",nullable=true,columnDefinition="varchar(21)")
private String city;
@Column(columnDefinition="bigint")
private int pincode;


public address() {
	super();
	// TODO Auto-generated constructor stub
}
public address(String street, String state, String city, int pincode) {
	super();
	this.street = street;
	this.state = state;
	this.city = city;
	this.pincode = pincode;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
