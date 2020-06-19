package Batching;

import javax.persistence.*;

@Entity
public class example {
@Id
private int id;
@Column(columnDefinition="varchar(21)")
private String name;
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

}
