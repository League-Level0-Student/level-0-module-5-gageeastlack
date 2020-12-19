package _01_algorithms._3_goofy_names;

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String goofyNames=JOptionPane.showInputDialog("Enter your name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(goofyNames.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for(int i =0; i<goofyNames.length(); i++) {
	// 4. Create a char variable to store the next character of the name
	//    use .charAt()

	char kitKat=goofyNames.charAt(i);

	// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
if(i % 2 ==0) {
	kitKat=Character.toUpperCase(kitKat);

}
else { 
	kitKat=Character.toLowerCase(kitKat);
}

	// 6. Even characters should be made uppercase and odd characters made lowercase
	//    HINT: use Character.toUpperCase() or Character.toLowerCase()


	// 7. ADD the char to the end of the goofyName String
goofyName+=kitKat;
}
			


		
		// 8. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, goofyName);
	}
}


