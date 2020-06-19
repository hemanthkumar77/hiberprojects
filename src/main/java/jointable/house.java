package jointable;

import javax.persistence.*;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class house {
@Id
@Column(name="lease_number")
private int lease_id;
@Column(name="name",columnDefinition="varchar(21)")
private String house_name;
@Column(columnDefinition="varchar(21)")
private String location;
public int getLease_id() {
	return lease_id;
}
public void setLease_id(int lease_id) {
	this.lease_id = lease_id;
}
public String getHouse_name() {
	return house_name;
}
public void setHouse_name(String house_name) {
	this.house_name = house_name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


}
