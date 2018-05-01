package test;


import java.math.BigDecimal;

public class Staff {

 String name;
 int age;
 BigDecimal salary;

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public BigDecimal getSalary() {
	return salary;
}


public void setSalary(BigDecimal salary) {
	this.salary = salary;
}




public Staff(){
	
}


public Staff(String name,int age,BigDecimal salary){
	this.setName(name)	;
	this.setAge(age);
	this.setSalary(salary);
	
}


}




