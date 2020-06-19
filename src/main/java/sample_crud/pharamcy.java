package sample_crud;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="medical_shop")
@NamedQuery(name="get", query="select e.id,e.name,a.date from pharamcy e inner join pharamacy_shop a on e.id=a.id")
public class pharamcy {
@Id
@Column(name="pills_id")
private int id;
@Column(name="pills_name",nullable=true,columnDefinition="varchar(25)")
private String name;
@Temporal(TemporalType.DATE)
private Date date;
@Column(name="total_cost",nullable=true,precision=5,scale=3)
private Double price;

public pharamcy() {
	super();
	// TODO Auto-generated constructor stub
}
public pharamcy(int id, String name, Date date, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.price = price;
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
