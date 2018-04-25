
public class CheckPalindrome {

	public CheckPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean checkPalindrome=checkPalindrome("malayalam");
		System.out.println(checkPalindrome);

	}

	private static boolean checkPalindrome(String str) {
		// TODO Auto-generated method stub
		int length=str.length();
		for (int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(length-i-1)){
				return false;
			}
		}
				
		return true;
	}

}
