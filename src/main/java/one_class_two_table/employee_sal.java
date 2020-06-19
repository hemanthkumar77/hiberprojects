package one_class_two_table;

import javax.persistence.*;

@Entity
@Table(name="employee_profile")
@SecondaryTable(name="salary_info")
public class employee_sal {
@Id
@Column(name="employee_id")
private int emp_is;
@Column(name="employee_name",nullable=true)
private String name;
@Column(columnDefinition="varchar(6)",nullable=true)
private String gender;
@Column(table="salary_info",nullable=true,columnDefinition="varchar(18)")
private String department;
@Column(table="salary_info",nullable=true,precision=6,scale=4)
private double salary;
@Column(table="salary_info",nullable=true,precision=4,scale=3)
private double taxes;
public employee_sal(int emp_is, String name, String gender, String department, double salary, double taxes) {
	super();
	this.emp_is = emp_is;
	this.name = name;
	this.gender = gender;
	this.department = department;
	this.salary = salary;
	this.taxes = taxes;
}
public int getEmp_is() {
	return emp_is;
}
public void setEmp_is(int emp_is) {
	this.emp_is = emp_is;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getTaxes() {
	return taxes;
}
public void setTaxes(double taxes) {
	this.taxes = taxes;
}

}
