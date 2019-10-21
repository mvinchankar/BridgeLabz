
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;


public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "Hello <<name>>, We have your full" + 
				"name as <<full name>> in our system."+"\n"
				+ "Your contact number is 91-xxxxxxxxxx." +"\n"+ 
				"Please,let us know in case of any clarification Thank you BridgeLabz xx/xx/xxxx";
		System.out.println("Enter your full name ");
		String uname = sc.nextLine();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String[] arr = uname.split(" ");
		String firstname = arr[0];
		String str1 = message.replace("<<full name>>", uname);
		String str2 = str1.replace("<<name>>", firstname);
		System.out.println("Enter 10 digit mobile number ");
		String mobno = sc.nextLine();
		System.out.println("Enter date ");
	//	String date = sc.nextLine();
		if(isMobValid(mobno))
		{
			String str3 = str2.replace("xxxxxxxxxx", mobno);
			String str4 = str3.replaceAll("xx/xx/xxxx", dateFormat.format(date));
		//	String str4 = str3.replace("xx/xx/xxxx", date);
			System.out.println(str4);
		}
		else 
		{
			System.out.println("Mobile or date is not valid");
		}
		
	}
	
	public static boolean isMobValid(String mobno) 
	{
		Pattern p = Pattern.compile("\\d{10}"); 
        Matcher m = p.matcher(mobno); 
        return (m.find() && m.group().equals(mobno)); 
	}
	
//	public static boolean isDateValid(String date) {
//		Pattern p = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"); 
//        Matcher m = p.matcher(date); 
//        return (m.find() && m.group().equals(date));
//	}
//	

}