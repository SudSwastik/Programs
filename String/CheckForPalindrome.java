
public class CheckForPalindrome {
	static boolean isPalindrome(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("sud-dus");
		String str1 = new String("sud");
		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome(str1));

	}

}
