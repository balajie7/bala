package Day1;

public class Test {
	public static void main(String[]args) {
		String a="phone";
		if(a.length()%2==0) {
			System.out.println(a);
		}
		else {
			System.out.println(a.substring(0,a.length()/2)+"-"+a.charAt(a.length()/2)+"-"+a.substring(a.length()/2+1,a.length()));
		}
		
	}

}
