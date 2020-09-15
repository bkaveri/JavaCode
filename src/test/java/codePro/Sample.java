package codePro;

public class Sample {
	public static void main(String[] args) {
		int num=12121, res=0,rem=0;
		int n=num;
		while (num>0) {
			
		
		rem=num%10;
		res=res*10+rem;
		num=num/10;}
		if(n==res) {
			System.out.println("palindrome");
		
	}
		else {
			System.out.println("not palindrome");
		}

}
}
