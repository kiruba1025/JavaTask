package stream.task;

import java.util.Date;
import java.util.List;

public class Stduent {
private int id;
private String name;
private String dob;
private String department;
private Address permanentAddress;
private Address temporaryAddress;
private List<Sem> semester;
private long phoneNo1;
private long phoneNo2;
private Gender gender;
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
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Address getPermanentAddress() {
	return permanentAddress;
}
public void setPermanentAddress(Address permanentAddress) {
	this.permanentAddress = permanentAddress;
}
public Address getTemporaryAddress() {
	return temporaryAddress;
}
public void setTemporaryAddress(Address temporaryAddress) {
	this.temporaryAddress = temporaryAddress;
}
public List<Sem> getSem() {
	return semester;
}
public void setSem(List<Sem> sem) {
	this.semester = sem;
}
public long getPhoneNo1() {
	return phoneNo1;
}
public void setPhoneNo1(long phoneNo1) {
	this.phoneNo1 = phoneNo1;
}
public long getPhoneNo2() {
	return phoneNo2;
}
public void setPhoneNo2(long phoneNo2) {
	this.phoneNo2 = phoneNo2;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public Stduent(int id, String name, String dob, String department, Address permanentAddress, Address temporaryAddress,
		List<Sem> sem, long phoneNo1, long phoneNo2, Gender gender) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.department = department;
	this.permanentAddress = permanentAddress;
	this.temporaryAddress = temporaryAddress;
	this.semester = sem;
	this.phoneNo1 = phoneNo1;
	this.phoneNo2 = phoneNo2;
	this.gender = gender;
}
public Stduent() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", dob='" + dob + '\'' +
            ", department='" + department + '\'' +
            ", permanentAddress=" + permanentAddress +
            ", temporaryAddress=" + temporaryAddress +
            ", semester=" + semester +
            ", phoneNo1=" + phoneNo1 +
            ", phoneNo2=" + phoneNo2 +
            ", gender=" + gender +
            '}';
}



}
