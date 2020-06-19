package singleinheritance;

import javax.persistence.*;

@Entity
@DiscriminatorValue("horror_games")
public class horror extends gamestore{
@Column(name="game_series",columnDefinition="varchar(21)")
private String collections;
@Column(precision=4,scale=3)
private double cost;

public String getCollections() {
	return collections;
}
public void setCollections(String collections) {
	this.collections = collections;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}


}
