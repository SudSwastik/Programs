public class RemoveSamePairAdjChar {
	static StringBuilder remove(StringBuilder sb){
		if(sb.length()==0||sb.length()==1){
			return sb;
		}
		for(int i=1;i<sb.length();i++){
			if(sb.charAt(i)==sb.charAt(i-1)){
				sb.deleteCharAt(i);
				sb.deleteCharAt(i-1);
				remove(sb);
			}
		}
		return sb;
	}
	
	public static void main(String[] args) {
		String str= new String("ADDABJJK");
		StringBuilder sb=new StringBuilder(str);
		System.out.println(remove(sb));
	}

}
