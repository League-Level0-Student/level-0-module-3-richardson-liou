package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String hapiness = JOptionPane.showInputDialog("Are you happy?");
	if (hapiness.equals("Yes")) {
		JOptionPane.showInputDialog("Don't change whaever your doing");
	}
	else if(hapiness.equals("No")) {
		String wantHappy = JOptionPane.showInputDialog("Would you like to be happy");
		if (wantHappy.equals("Yes")) {
			JOptionPane.showInputDialog("Do something you like to do");
			if (wantHappy.equals("No")) {
				
			JOptionPane.showMessageDialog(null, "Ok, live your life than");
			}
		}
	}
}
}
