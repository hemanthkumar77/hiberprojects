package table_per_classes;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vechile {
@Id
private int id;
@Column(nullable=true,columnDefinition="varchar(18)")
private String show_room_name;
@Column(nullable=true,columnDefinition="varchar(18)")
private String branch;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getShow_room_name() {
	return show_room_name;
}
public void setShow_room_name(String show_room_name) {
	this.show_room_name = show_room_name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

}
