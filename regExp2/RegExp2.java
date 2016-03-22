package regExp2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {

		System.out.println(zip("hellowoooorld"));
		
		String adress2 = "asdfr.xml";
		// є2 задание - split'ом на лексемы, последн€€ - расширение;
		
		String[] arr = adress2.split("\\.");
		if (arr.length==0){
		System.out.print("what's the name?");
		} else {
			String newadress2 = arr[arr.length-1];
			System.out.println(newadress2);//."smth";
		}
		
		Pattern pattern1 = Pattern.compile("[^ ]+\\.xml"); 
        Matcher matcher1 = pattern1.matcher(adress2);
		//String[] newadress2 = adress2.split("\\."); 
        if(matcher1.find()){
			System.out.println("Ye!");
		}else {
			System.out.println("Error.");
		}
		
    }
 //Let's create method for rebuild this line;
	
    private static String zip(String data) {
        String result = "";
 
        Pattern pattern = Pattern.compile("(.)\\1{0,}");//any symbol 0 or more; 
 
        Matcher matcher = pattern.matcher(data);
 
        while (matcher.find()) {
            result += matcher.group(1);
            int length = matcher.group().length();
            if (length > 1)
                result +=  length;
        }
        return result;//result = symb[0]+..+symb[n]+n.length(>1)+..;
		


	}
    
    
    

}
