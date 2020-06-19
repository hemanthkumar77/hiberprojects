package two_class_one_table;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="student_profile")
public class student {
@Id
@Column(name="student_id")
private int id;
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student(int id, String name, int age, Date date_of_join, address add) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.date_of_join = date_of_join;
	this.add = add;
}
@Column(nullable=true)
private String name;
@Column(columnDefinition="smallint",nullable=false)
private int age;
@Temporal(TemporalType.DATE)
private Date date_of_join;
@Embedded
private address add;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDate_of_join() {
	return date_of_join;
}
public void setDate_of_join(Date date_of_join) {
	this.date_of_join = date_of_join;
}
public address getAdd() {
	return add;
}
public void setAdd(address add) {
	this.add = add;
}

}
