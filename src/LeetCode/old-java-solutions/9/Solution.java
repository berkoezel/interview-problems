// 9 - Palindrome Number
import java.util.ArrayList;

class Solution{
	public static void main (String args[]){
	System.out.println(isPalindrome(101));
	}
	public static boolean isPalindrome(int x){
	if(x < 0) return false;
  if(x < 10) return true;

  ArrayList<Integer> digits = new ArrayList<>();
  while(x >= 10){
  digits.add(x % 10);
  x /= 10;
  }
  digits.add(x);

  for(int i=0; i<digits.size()/2; i++)
    if(digits.get(i) != digits.get(digits.size() - i - 1)) return false;


  return true;	
	}

}
