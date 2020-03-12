
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 18th";
		String dadsBirthday = "February 28th";
		String myBirthday = "June 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthdayChoice = JOptionPane.showInputDialog("Who's Birthday would you like to know?");
		// 3. Print out what the user typed
		System.out.println(birthdayChoice);
		// 4. if user asked for "mom"
		if (birthdayChoice.equals("mom")) {
			JOptionPane.showMessageDialog(null, "January 18th");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if (birthdayChoice.equals("dad")){
			JOptionPane.showMessageDialog(null, "February 28th");
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if (birthdayChoice.equals("You")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null,"I don't know");
		}
	} 
}
