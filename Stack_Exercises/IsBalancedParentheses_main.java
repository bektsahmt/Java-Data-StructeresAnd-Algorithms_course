package Stack_Exercises;

public class IsBalancedParentheses_main {

	public static void main(String[] args) {
		// Check to see if a string of parentheses is balanced or not.
		
		String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true
        
    }
    
    public static boolean isBalancedParentheses(String parentheses){
        Stack<Character> stack = new Stack<>();
        for(char p: parentheses.toCharArray()){
            if(p == '('){
                stack.push(p);
            }else if(p == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        }

	}


