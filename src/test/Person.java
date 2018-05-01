package test;

public class Person {

	    String name;
	    int age;
	    String adresse;

	    Person(String name, int age,String adresse) {
	        this.name = name;
	        this.age = age;
	        this.adresse = adresse;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	
}
