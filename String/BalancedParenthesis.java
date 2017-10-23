/*check if parenthesis are balanced or not*/
/*input "{}()", "[{()}]", "({()})", "{}(", "({)}", "[[", "}{"*/
import java.util.*;
public class BalancedParenthesis {	
	public static boolean isBalanced(String s) {
		Deque<Character> leftChars = new LinkedList<>() ;
		for (int i = 0; i < s.length(); ++i) {
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
					leftChars.addFirst(s.charAt(i));
				}
				else{
					if(leftChars.isEmpty()){
						return false;
					}
					if((s.charAt(i)==')'&&leftChars.peekFirst()!='(')||(s.charAt(i)=='}'&&leftChars.peekFirst()!='{')||(s.charAt(i)==']'&&leftChars.peekFirst()!='[')){
						return false;
					}
					leftChars.removeFirst();
			    }
				
		}
		return leftChars.isEmpty();
	}	
	   public static void main(String []argh){
	      Scanner sc = new Scanner(System.in);
	      while(sc.hasNext()){
	          String s= sc.next();
	           System.out.println(isBalanced(s));
	     }
	                  
	   }

	
}

