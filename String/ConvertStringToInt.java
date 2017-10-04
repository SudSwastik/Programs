public class ConvertStringToInt {
	static int convert(String str){
		int result=0;
		for(int i=str.charAt(0)=='-'?1:0;i<str.length();i++){
			int digit=str.charAt(i)-'0';
			result=result*10+digit;
		}
		return str.charAt(0)=='-'?-result:result;	
	}
	
	public static void main(String[] args) {
		String str= new String("1234");
		String str1= new String("-456");
		System.out.println(convert(str));
		System.out.println(convert(str1));
	}

}
