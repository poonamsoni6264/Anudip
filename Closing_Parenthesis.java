package Bank_Problem;

public class Closing_Parenthesis {
	
      public static void main(String[] args) {
    	  
    	  String sentence = "Sometimes (When I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
    	  int openingParenthesisIndex = 10;
    	  int closingParenthesisIndex = findClosingParenthesis(sentence , openingParenthesisIndex);
    	   
    	  System.out.println("Closing parenthesis at index : " + closingParenthesisIndex);
      }
      
      public static int findClosingParenthesis(String sentence, int openIndex) {
    	  if(sentence.charAt(openIndex) != '(') {
    		  throw new IllegalArgumentException("The character at the provided index is not an opening parenthesis.");
    	  }
    	  int openParenthesisCount = 0;
    	  
    	  for(int i = openIndex; i<sentence.length(); i++) {
    		  if(sentence.charAt(i) == '(') {
    			  openParenthesisCount++;
    		  }
    		  else if(sentence.charAt(i) == ')'){
    			  openParenthesisCount--;
    			  if(openParenthesisCount == 0) {
    				  return i;
    			  }
    			  
    		  }
    	  }
    	  //if no matching closing parenthesis found.
    	  throw new IllegalArgumentException("No matching closing parenthesis found.");
      }
}
