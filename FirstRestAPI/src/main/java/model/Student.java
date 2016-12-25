package model;

import java.io.Serializable;

public class Student implements Serializable {
private static final long serialVersionId = 1L;


private String name;
private String address;
private int rollNo;

public Student()
{
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

}
