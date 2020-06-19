package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="calss_students_profiles")
public class Student {
@Id
private int id;
private String name;
@Column(columnDefinition="varchar(15)")
private String department;
@Column(columnDefinition="varchar(14)")
private String major;
@ManyToMany
@JoinTable(name="STAFF_HANDLERS",joinColumns={@JoinColumn(name="student_id")},inverseJoinColumns={@JoinColumn(name="staff_id")})
private List<staffs>sta=new ArrayList();

public Student(int id, String name, String department, String major) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.major = major;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public List<staffs> getSta() {
	return sta;
}
public void setSta(List<staffs> sta) {
	this.sta = sta;
}


}
