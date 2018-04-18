package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jun {
	public static void main(String[] args) {
		String a="/services/abc/test/123";
		String regex="^/services/abc/.*/.*";
		Pattern p = Pattern.compile(regex);
		Matcher m=p.matcher(a);
		 if (m.find( )) {
			 System.err.println(m.group());
		 }
	}
	List<String> list=new ArrayList<>();

}
