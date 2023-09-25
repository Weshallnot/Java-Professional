package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

	public static void main(String[] args) {
		
		Pattern phonePattern = Pattern.compile("(\\d{3})-(\\d{3})-(\\d{4})");
		Matcher phoneMatcher = phonePattern.matcher("abcd800-555-1234wxyz");
		
		System.out.println(phoneMatcher.find());
		
		String number = phoneMatcher.group(0); //"800-555-1234" (Group 0 is everything the regex matched)
		String aCode = phoneMatcher.group(1); //"800"
		String threeDigit = phoneMatcher.group(2); //"555"
		String fourDigit = phoneMatcher.group(3); //"1234"
		
		System.out.println(number);
		System.out.println(aCode);
		System.out.println(threeDigit);
		System.out.println(fourDigit);
		
		//String aCode2 = phoneMatcher.group("AreaCode"); //"800"
		
		//System.out.println(aCode2);
		
		/** Using regex with custom behaviour by compiling the Pattern with flags **/
		
		Pattern pattern = Pattern.compile("foo.", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		pattern.matcher("FOO\n").matches(); // Is true.
		/* Had the regex not been compiled case insensitively and singlelined,
		 * it would fail because FOO does not match /foo/ and \n (newline)
		 * does not match /./.
		 */
		Pattern anotherPattern = Pattern.compile("(?si)foo");
		anotherPattern.matcher("FOO\n").matches(); // Is true.
		"foOt".replaceAll("(?si)foo", "ca"); // Returns "cat".

		/**  Escape Characters **/
		
		System.out.println("a|b".split ("|")); // [a, |, b]

		System.out.println("\\".matches("\\")); // PatternSyntaxException

		
	}

}
