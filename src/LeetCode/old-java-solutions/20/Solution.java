// 20 - Valid Paranthesis

import java.util.Stack;

class Solution{
	public static void main(String args[]){
		String s1 = "(]";
		String s2 = "([)]";
		String s3 = "{[]}";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
	}
	public static boolean isValid(String s){
		if(s.length() == 0) return true;
		if(s.length() % 2 != 0) return false;
		Stack<String> stk = new Stack<>();
		
		for(char i : s.toCharArray()){

			if(i == '{' || i == '(' || i == '['){
				stk.push(i + "");
				continue;
			}
			else if(i == '}' || i == ')' || i == ']'){
				if(stk.isEmpty()) return false;
				String peek = stk.pop();
				if( i == '}' && !peek.equals("{")) return false;
				if( i == ']' && !peek.equals("[")) return false;
				if( i == ')' && !peek.equals("(")) return false;
				}
			}
	return stk.isEmpty();
	}
}

	

