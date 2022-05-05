package week8;

public class Mammal1 {
	
	//attributes
	
	private int numOfLegs;
	private static boolean hasFur;
	private static String species;
	
	
	// default constructor
	public Mammal1 () {
		
		this.numOfLegs = 2;
		this.hasFur = true;
		this.species = "Bear";
		
		
	}
	
	
	
	public Mammal1(int numOfLegs,boolean hasFur, String species) {
		
		this.numOfLegs = numOfLegs;
		this.hasFur =  hasFur;
		this.species = species;
		
	}
	
	//setter
	public void setNumofLegs( int numOfLegs) {
		
		this.numOfLegs = numOfLegs;
		
	}
	
	
 public void sethasFur (boolean hasFur) {
		
		this.hasFur = hasFur;
		
	}

public void setSpecies( String species) {
	
	this.species.equals(species);
	
}
	
	public int getNumOfLegs() {
		
		return this.numOfLegs;
	}
	
	
	public static void main (String []args) {
		
		Mammal1 mammal1 = new Mammal1();
		
		System.out.println(Mammal1.hasFur);
		System.out.println(Mammal1.species);
		
	}
	}


