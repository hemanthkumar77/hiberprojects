package onetomany;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="college_profile")
public class college {
@Id
private int id;
@Column(columnDefinition="varchar(27)",nullable=true)
private String name;
@Column(columnDefinition="varchar(14)",nullable=true)
private String controller;
@Lob
private String location;
@OneToMany(targetEntity=Department.class,mappedBy="coll",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Department>dept;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public college() {
	// TODO Auto-generated constructor stub
}
public String getController() {
	return controller;
}
public String getLocation() {
	return location;
}

public List<Department> getDept() {
	return dept;
}
public college(int id, String name, String controller, String location) {
	super();
	this.id = id;
	this.name = name;
	this.controller = controller;
	this.location = location;
}


}
