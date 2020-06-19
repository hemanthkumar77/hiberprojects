package singleinheritance;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Shooting_collections")
public class shooting {
@ Id
private String collection_name;
@Column(columnDefinition="varchar(21)")
private String company_name;
@Column(precision=4,scale=3)
private double cost;
public String getCollection_name() {
	return collection_name;
}
public void setCollection_name(String collection_name) {
	this.collection_name = collection_name;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

}
