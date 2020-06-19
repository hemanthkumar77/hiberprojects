package singleinheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="gamestore_collections",discriminatorType=DiscriminatorType.STRING)
public class gamestore {
@Id
private int gamestore_id;
@Column(name="branch_name",columnDefinition="varchar(21)",nullable=true)
private String store_name;
@Column(columnDefinition="varchar(21)")
private String current_condition;
@Lob
private String customer_details;
public String getCurrent_condition() {
	return current_condition;
}
public void setCurrent_condition(String current_condition) {
	this.current_condition = current_condition;
}
public String getCustomer_details() {
	return customer_details;
}
public void setCustomer_details(String customer_details) {
	this.customer_details = customer_details;
}
public int getGamestore_id() {
	return gamestore_id;
}
public void setGamestore_id(int gamestore_id) {
	this.gamestore_id = gamestore_id;
}
public String getStore_name() {
	return store_name;
}
public void setStore_name(String store_name) {
	this.store_name = store_name;
}

}
