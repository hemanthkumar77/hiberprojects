package defaultinheritance;

import javax.persistence.*;

@Entity
@Table(name="cargo_office")
public class cargo {
@Id
private int id;
@Column(name="barnch_loctaions",columnDefinition="varchar(21)",nullable=true)
private String branch_name;
@Column(name="from_detsination",columnDefinition="varchar(21)",nullable=true)
private String sender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBranch_name() {
	return branch_name;
}
public void setBranch_name(String branch_name) {
	this.branch_name = branch_name;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}


}
