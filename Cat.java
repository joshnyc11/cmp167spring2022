package week9;
// using the example from the dog class, make a cat class
// with at lease 3 attributes, setters and getts and two constructors
//use equals method,toString method and a custom method


/*
*  Cat
*  
*  name:String
*
*
*
*
*
*/
public class Cat {

	private String name;
	private int age;
	private String species;
	
	public Cat () {
		
		this.name = " Marbles";
		this.age = 7;
		this.species = " Shorthair";
	}
	
	public Cat(String name,int age,String species) {
		
		this.name = name;
		this.age = age;
		this.species = species;
		
	}
	
	public static void main(String[] args) {
	
		
		
		//attributes
		

	}
	
	public void setTheName(String name) {
		
		this.name = name;
	}
	
public void setTheAge(int age) {
		
		this.age = age;
	}

public void setTheSpecies(String species) {
	
	this.species = species;
}

public String getTheName() {
	
	return this.name;
	
}
	
public int getTheAge() {
	
	return this.age;
	
}


public String getTheSpecies() {
	
	return this.species;
	
}

public boolean equals(Object jn) {
	
	if ( jn == this) return true;
	if (jn == null) return false;
	
	
	if (jn instanceof Cat) {
		
		Cat anotherCat = (Cat) jn;
		return anotherCat.name.equals(this.name)&&anotherCat.name.equals(this.age)&&anotherCat.name.equals(this.species);
	}
	return false;
	
	
	}
	
public String toString() {
	
	return "Cat name = " + this.name + " Age = " + this.age + " Species = "  + this.species;
	
}

public void meow () {
	System.out.println("meow");
	
}
	
}

	
	
	
	
	





