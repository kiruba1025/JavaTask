package stream.task;

public class Subjects {
private String tamil;
private String english;
private String math;
private String science;
private String socialScience;
 

public Subjects(String tamil, String english, String math, String science, String socialScience) {
	super();
	this.tamil = tamil;
	this.english = english;
	this.math = math;
	this.science = science;
	this.socialScience = socialScience;
}

@Override
public String toString() {
	return "Subjects [tamil=" + tamil + ", english=" + english + ", math=" + math + ", science=" + science
			+ ", socialScience=" + socialScience + "]";
}

public String getTamil() {
	return tamil;
}
public void setTamil(String tamil) {
	this.tamil = tamil;
}
public String getEnglish() {
	return english;
}
public void setEnglish(String english) {
	this.english = english;
}
public String getMath() {
	return math;
}
public void setMath(String math) {
	this.math = math;
}
public String getScience() {
	return science;
}
public void setScience(String science) {
	this.science = science;
}
public String getSocialScience() {
	return socialScience;
}
public void setSocialScience(String socialScience) {
	this.socialScience = socialScience;
}

}
