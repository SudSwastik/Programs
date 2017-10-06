
public class ConvertIntToString {
	static String convert(int num){
		boolean neg=false;
		if(num<0){
			neg=true;
		}
		StringBuilder str= new StringBuilder();
		while(num!=0){
			str.append((char)(Math.abs(num%10)+'0'));
			num=num/10;
		}
		str.reverse();
		if(neg)	
			return "-"+str.toString();
		return str.toString();
	}
	public static void main(String[] args) {
		int num=587;
		int num1=-897;
		System.out.println(convert(num));
		System.out.println(convert(num1));
	}

}
