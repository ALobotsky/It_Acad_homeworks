package regExp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) {
	
		//2510 CT-7
				Pattern pattern = Pattern.compile("[0-9]{4}\\s{1}[A-Z]{2}\\-[1-7]{1}");
				Matcher matcher = pattern.matcher("2590 CT-3");		
				if(matcher.find()){
					System.out.println("Ye!");
				}else {
					System.out.println("Error.");
				}
				
				//+375 29 707-13-78
				//+375 29 7071378
				//+375(29)  7071378
				// +3752970r7137-8
				//"[a-zA-Z]+", ""
				//^3(3[0-9]|5[012356789]|7[678]|8[0-9])(?=\\d{9}$)
				
				String str1="+375(29) 7071378";
				String strAfter = str1.replaceAll("\\D", "");
				
				System.out.println(strAfter);
				
				
				Pattern pattern1 = Pattern.compile("[0-9]{12}");
				Matcher matcher1 = pattern1.matcher(strAfter);		
				if(matcher1.find()){
					System.out.println("Ye!");
				}else {
					System.out.println("Error.");
				}
				
				
	}

}
