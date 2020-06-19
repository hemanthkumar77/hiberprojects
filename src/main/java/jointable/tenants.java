package jointable;

import java.util.Date;

import javax.persistence.*;

@Entity
public class tenants extends house {
@Column(name="tenants_name")
private String client_name;
@Column(name="apartment_number",columnDefinition="varchar(9)")
private String door_number;
@Column(name="valid_years",columnDefinition="smallint")
private int years;
@Column(precision=6,scale=4)
private double lease_amount;
@Temporal(TemporalType.DATE)
private Date date;
public String getClient_name() {
	return client_name;
}
public void setClient_name(String client_name) {
	this.client_name = client_name;
}
public String getDoor_number() {
	return door_number;
}
public void setDoor_number(String door_number) {
	this.door_number = door_number;
}
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}
public double getLease_amount() {
	return lease_amount;
}
public void setLease_amount(double lease_amount) {
	this.lease_amount = lease_amount;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
