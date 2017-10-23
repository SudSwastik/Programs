public class ConvertExcelColNameToInt {
	static long convert(String str){
		long result=0;
		for(int i=0;i<str.length();i++){
			result=result*26+str.charAt(i)-'A'+1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str= new String("ZZ");
		String str1= new String("A");
		String str2= new String("ZZAZABX");
		System.out.println(convert(str));
		System.out.println(convert(str1));
		System.out.println(convert(str2));
	}
}
