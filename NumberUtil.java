

import java.util.regex.Pattern;

public class NumberUtil {
	public static int nullConvertToInt(Object obj){
		if(obj == null)
			return 0;		
		String str = String.valueOf(obj); 
		return Pattern.matches("^[0-9]*$", str) ? Integer.parseInt(str) : 0;	
	}
	
	
	public static double nullConvertToDouble(Object obj){
		if(obj == null)
			return 0;		
		String str = String.valueOf(obj); 
		return Pattern.matches("^[0-9]*(.{0,1})[0-9]*$", str) ? Double.parseDouble(str) : 0;
	}
	//^[0-9]{0,2}(\.[0-9]{0,2})?$
	
	public static void main(String[] args){
		String a = "1232";
		System.out.println( nullConvertToInt(a) );
		
		String b = "12333";
		System.out.println(nullConvertToDouble(b));
		
		
	}
}
