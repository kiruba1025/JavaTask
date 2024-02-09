package stream.task;

import java.util.List;

public class Sem {
private List<Subjects>semI;
private List<Subjects>semII;
private List<Subjects>semIII;
private List<Subjects>semIV;


public Sem(List<Subjects> semI, List<Subjects> semII, List<Subjects> semIII, List<Subjects> semIV) {
	super();
	this.semI = semI;
	this.semII = semII;
	this.semIII = semIII;
	this.semIV = semIV;
}

@Override
public String toString() {
	return "Sem [semI=" + semI + ", semII=" + semII + ", semIII=" + semIII + ", semIV=" + semIV + "]";
}

public List<Subjects> getSemI() {
	return semI;
}
public void setSemI(List<Subjects> semI) {
	this.semI = semI;
}
public List<Subjects> getSemII() {
	return semII;
}
public void setSemII(List<Subjects> semII) {
	this.semII = semII;
}
public List<Subjects> getSemIII() {
	return semIII;
}
public void setSemIII(List<Subjects> semIII) {
	this.semIII = semIII;
}
public List<Subjects> getSemIV() {
	return semIV;
}
public void setSemIV(List<Subjects> semIV) {
	this.semIV = semIV;
}



}
