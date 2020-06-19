package defaultinheritance;

import java.util.Date;

import javax.persistence.*;
@Entity
public class reciever extends cargo {
@Lob
private String reciver_info;
@Temporal(TemporalType.TIMESTAMP)
private Date date;
@Column(precision=5,scale=3)
private double cost;
public String getReciver_info() {
	return reciver_info;
}
public void setReciver_info(String reciver_info) {
	this.reciver_info = reciver_info;
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

}
