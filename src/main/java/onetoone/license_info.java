package onetoone;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="driver_details")
public class license_info {
@Id 
@GeneratedValue
private int id;	
@Column(name="address_info",nullable=true)
private String address;
public license_info( String address, String state, Date date, String vechile_type, owner own) {
	super();
	this.address = address;
	State = state;
	this.date = date;
	this.vechile_type = vechile_type;
	this.own = own;
}
@Column(columnDefinition="varchar(18)",nullable=true)
private String State;
public license_info() {
}
@Temporal(TemporalType.DATE)
private Date date;
@Column(nullable=true,columnDefinition="varchar(23)")
private String vechile_type;
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="license_number_fk")
private owner own;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getVechile_type() {
	return vechile_type;
}
public void setVechile_type(String vechile_type) {
	this.vechile_type = vechile_type;
}

}
