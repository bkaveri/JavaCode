package codePro;

public class Stream {
	public static void main(String[] args) {
		String s="welcome to java world";
		String reString=" ";
		for(int i=s.length()-1;i>=0;i--) {
			reString=reString+s.charAt(i);}
			System.out.println(reString);
		}
	
}
