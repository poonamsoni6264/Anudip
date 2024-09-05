package hillsattion_overriding_problem;

//This is a Superclass
public class HillStation {
	
	//Superclass location function
	public void location() {
		System.out.println("This is a Superclass(HillStation) location");
	}
	
	//superclass famous function
	public void famousFor() {
		System.out.println("This is a famous for Cool Climate");
	}
	
	public static void main(String[] args) {
		HillStation HS = new HillStation();
		HS.location();
		HS.famousFor();
		System.out.println();
		
		
    	//call in main function 
		//HillStation is superclass HS is reference of superclass
        HS = new Manali();//create a Manali object for call 
    	HS.location();//call Manali location
    	HS.famousFor();//call famous function
    	System.out.println();//for one line gaping between Manali and Mussoorie print statement 
    	
    	//Create a Mussoorie object through superclass reference
        HS = new Mussoorie();//create a Mussoorie object for call 
    	HS.location();//call Mussoorie location
    	HS.famousFor();//call famous function
    	System.out.println();//for one line gaping between Mussoorie and Gulmarg print statement
    	
    	//Create a Gulmarg object through superclass reference
        HS = new Gulmarg();//create a Gulmarg object for call 
    	HS.location();//call Gulmarg location
    	HS.famousFor();//call famous function
    	
    }
}
	
//Three subclasses  Manali, Mussoorie, Gulmarg.
	
//first subclass
class Manali extends HillStation {
	// first subclass location
	public void location() {
		System.out.println("Manali is located in Himachal_Pradesh");
	}
		
//first subclass famous function
	public void famousFor() {
		System.out.println("This is a famous for Natural Beauty");
		}
	}
	
//second subclass
class Mussoorie extends HillStation {
    // second subclass location
    public void location() {
    	System.out.println("Mussoorie is located in Uttarakhand");
    }
    			
     //second subclass famous function
    public void famousFor() {
    	System.out.println("This is a famous for old wold charm, variety of activities");
    	}
	}
    
//third subclass
class Gulmarg extends HillStation {
    // third subclass location
    public void location() {
    	System.out.println("Gulmarg is a town in the Baramulla district of Jammu and Kashmir");
    	}
    	
    //third subclass famous function
    public void famousFor() {
    	System.out.println("This is a famous for winter sports destination, its natural meadows");
    	}
	}
    
	
	
    

