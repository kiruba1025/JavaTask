package stream.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;


public class StreamStduent {
 // @SuppressWarnings("null")
public static void main(String[] args) {
	  Address permanentAddress = new Address("123 Main St", "tnj", "tn", "india", "621701");
      Address temporaryAddress = new Address("456 north St", "ond", "tn", "india", "621005");
	  Address permanentAddress1 = new Address("321 Main St", "ond", "tn", "india", "621701");


	  Subjects semI =new Subjects("90", "80", "75", "60", "85");
	  Subjects semII =new Subjects("91", "80", "75", "60", "85");
	  Subjects semIII =new Subjects("93", "80", "75", "60", "85");
	  Subjects semIV =new Subjects("94", "80", "75", "60", "85");
	  
	  List<Subjects> sem1 =new ArrayList<Subjects>();
	  List<Subjects> sem2 =new ArrayList<Subjects>();
	  List<Subjects> sem3=new ArrayList<Subjects>();
	  List<Subjects> sem4=new ArrayList<Subjects>();
	  sem1.add(semI);
	  sem2.add(semII);
	  sem3.add(semIII);
	  sem4.add(semIV);
	  
	  List<Sem> sem = new ArrayList<>();
	  sem.add(new Sem(sem1, sem2, sem3, sem4));
//	  Sem sems =new Sem(sem1, sem2, sem3, sem4);
//	  sem.add(sems);

	  
	  Stduent student = new Stduent(0, "Deepa", "03/06/1999", "cs", permanentAddress, temporaryAddress, sem, 984724787, 887285243, Gender.FEMALE);
      Stduent student1= new Stduent(1, "Kiruba", "05/02/2000", "maths", permanentAddress1, temporaryAddress, sem, 984724787, 887285243, Gender.FEMALE);
	  List<Stduent> students = new ArrayList<>();
      students.add(student);
      students.add(student1);
      
      //for (Stduent stu : students) {
          System.out.println(students.toString());
         
      //}
        
          
          students.stream().collect(Collectors.groupingBy(Stduent::getDepartment)).forEach((k,v)->System.out.println(k+" "+v));
      
          students.stream().collect(Collectors.groupingBy(Stduent::getDepartment,
              Collectors.mapping(Stduent::getName, Collectors.collectingAndThen(Collectors.toList(),
                      studentNames -> {
                          Collections.sort(studentNames, Collections.reverseOrder());
                          return studentNames;})))) .forEach((department, studentNames) -> {
              System.out.println("Department: " + department);
              System.out.println("Students: " + studentNames);
          });
             

//              departmentStudentMap.forEach((department, studentNames) -> {
//                  System.out.println("Department: " + department);
//                  System.out.println("Students: " + studentNames);
//              });
          }	
}
