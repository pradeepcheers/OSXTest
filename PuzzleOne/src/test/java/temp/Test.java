package temp;

public class Test {
	
	public static void main(String [] v){
	
		String str = "99777666";
		String temp = "";
		int numberLength = str.length();
		
		System.out.println(99777666 / 1000);
		
		for(int x = 0, i = numberLength; i>0; i=i-3){
			x = (i < 3) ? 0 : i-3;
			temp = str.substring(x, i);
			System.out.println(temp);
		}
		
	}

}
