package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="STAFF_profiles")
public class staffs {
@Id
private int id;
private String name;
private String designation;
private String subject;
@ManyToMany
@JoinTable(name="STAFF_HANDLERS",joinColumns={@JoinColumn(name="staff_id")},inverseJoinColumns={@JoinColumn(name="student_id")})
private List<Student>stu=new ArrayList();

public staffs(int id, String name, String designation, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.subject = subject;
}
public List<Student> getStu() {
	return stu;
}
public void setStu(List<Student> stu) {
	this.stu = stu;
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}


}
