//Balanced Parenthesis Problem
package in.assignment3;

import java.util.Stack;

public class assign26 {  
	    public static boolean isBalanced(String str) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : str.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }
	        
	        return stack.isEmpty();
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "{[()]}"; 
	        String str2 = "{[(])}"; 
	        
	        System.out.println("Is \"" + str1 + "\" balanced? " + isBalanced(str1));
	        System.out.println("Is \"" + str2 + "\" balanced? " + isBalanced(str2));
	    }
	}
