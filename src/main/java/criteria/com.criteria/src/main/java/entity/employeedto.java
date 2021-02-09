package entity;

public class employeedto {
private double max_sal;
private double min_sal;
private double avg_sal;
private Long no_of_employees;
public employeedto(double max_sal, double min_sal, double avg_sal, Long no_of_employees) {
	super();
	this.max_sal = max_sal;
	this.min_sal = min_sal;
	this.avg_sal = avg_sal;
	this.no_of_employees = no_of_employees;
}
public double getMax_sal() {
	return max_sal;
}
public double getMin_sal() {
	return min_sal;
}
public double getAvg_sal() {
	return avg_sal;
}
public Long getNo_of_employees() {
	return no_of_employees;
}
@Override
public String toString() {
	return "employeedto [max_sal=" + max_sal + ", min_sal=" + min_sal + ", avg_sal=" + avg_sal + ", no_of_employees="
			+ no_of_employees + "]";
}


}
