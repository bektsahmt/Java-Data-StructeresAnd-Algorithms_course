package Stack_Exercises;

public class ReverseString_main {

	public static void main(String[] args) {
		// The reverseString method takes a single parameter String, which is the string you want to reverse.
		// Return a new String with the letters in reverse order.
		
		    String myString = "hello";
	        String reversedString = reverseString(myString);
	        System.out.println(reversedString);
		
		
	    
	}
	
	public static String reverseString(String string){
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        for(char c: string.toCharArray()){
            stack.push(c);
        }
        
        while(!stack.isEmpty()){
            reversedString += stack.pop();
        }
        return reversedString;
	}

}
