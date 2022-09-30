package com.syntax.review3;

public class StringMethodsTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// trim
		String textFromApplication = " Enroll today";
		String textFromUserStory = "Enroll today";

		if (textFromApplication.equals(textFromUserStory)) {
			System.out.println("Text is matched. Test Passes");
		} else {
			System.out.println("Text is not matched. Test Failed");
		}
		System.out.println(textFromApplication.trim());
//subsring
		String str = "Hello Class";
		String part2 = str.substring(6);
		System.out.println(part2);
		String part1 = str.substring(0, 5);
		System.out.println(part1);
//concatenate
		String newString = part1.concat(" ").concat(part2);
		System.out.println(newString);
// some examples
		char single = newString.substring(6).charAt(0);
		System.out.println(single);
// replace
		String myString = "Today is September";
		myString = myString.replace("September", "October");
		System.out.println(myString);
		myString = myString.replace('T', 't');
		System.out.println(myString);
// split
		String myStr="Today is a review class.";
		String[] array=myStr.split(" ");
		System.out.println(array.length);
System.out.println(array[3]);
for (int i=0;i<array.length;i++) {
	System.out.println(array[i]);
	//other way - enhanced loop
	for(String arr:array) {
		System.out.println(arr);
	}
}
	}
}
