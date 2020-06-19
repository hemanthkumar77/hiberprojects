package onetomany;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
public class Department {
@Id
private int id;
@Column(columnDefinition="varchar(9)")
private String name;
@Column(columnDefinition="bigint")
private int Strength;
@ManyToOne
@JoinColumn(name="college_id_FK")
private college coll;
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setStrength(int strength) {
	Strength = strength;
}
public void setColl(college coll) {
	this.coll = coll;
}
public Department() {
	// TODO Auto-generated constructor stub
}
public Department(int id, String name, int strength, college coll) {
	super();
	this.id = id;
	this.name = name;
	Strength = strength;
	this.coll = coll;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getStrength() {
	return Strength;
}
public college getColl() {
	return coll;
}

}
