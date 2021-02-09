package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="HR_DB")
public class employee {
public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
private int emp_id;
@Column(name="employee_name",columnDefinition="varchar(25)")
private String emp_name;
@Column(name="dept_name",columnDefinition="varchar(7)")
private String dept_name;
@Column(precision=5,scale=3)
private double salary;
public int getEmp_id() {
	return emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public String getDept_name() {
	return dept_name;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name + ", salary=" + salary
			+ "]";
}
public employee(int emp_id, String emp_name, String dept_name, double salary) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.dept_name = dept_name;
	this.salary = salary;
}


}
