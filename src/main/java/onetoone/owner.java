package onetoone;

import javax.persistence.*;

@Entity
@Table(name="citizen")
public class owner {
public owner() {
	}
@Id
private int linecse_number;
@Column(nullable=true)
private String name;
@Column(columnDefinition="smallint")
private int age;
@OneToOne(mappedBy="own")
private license_info info;
public license_info getInfo() {
	return info;
}
public void setInfo(license_info info) {
	this.info = info;
}
public int getLinecse_number() {
	return linecse_number;
}
public void setLinecse_number(int linecse_number) {
	this.linecse_number = linecse_number;
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
public owner(int linecse_number, String name, int age) {
	super();
	this.linecse_number = linecse_number;
	this.name = name;
	this.age = age;
}

}
