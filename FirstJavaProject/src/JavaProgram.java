import java.util.Scanner;
import java.util.regex.Matcher;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s = "Stringgiu56@#$";

		 System.out.println(s.replaceAll("[a-z A-Z 0-9]+", "")); // remove everything apart from "a-z and A-Z 0-9"
		
	}

}
