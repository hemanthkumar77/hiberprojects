package table_per_classes;

import java.util.Date;

import javax.persistence.*;
@Entity
public class two_wheeler extends Vechile{
@Column(name="company",columnDefinition="varchar(21)",nullable=true)
private String company_name;
@Column(name="model_name",columnDefinition="varchar(21)",nullable=true)
private String model;
@Temporal(TemporalType.TIMESTAMP)
private Date date;
@Column(precision=6,scale=4,nullable=true)
private double cost;
private int cc;
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}

}
