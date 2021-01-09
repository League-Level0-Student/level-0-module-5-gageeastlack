package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petType=JOptionPane.showInputDialog(null, "What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0; i<7; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Treats", "Play with it", "take a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	giveTreats(petType);
}
else if(task==1) {
	play(petType);
}
else if(task==2) {
	walkin(petType);
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	if(happinessLevel>=11) {
		JOptionPane.showMessageDialog(null, "Congrats! You've made your pet happy!");
		System.exit(0);
	}
	else {JOptionPane.showMessageDialog(null, "Your "+petType+"'s happiness level is "+happinessLevel+"."); 
	}}}
		

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void giveTreats(String petType) {
		if(petType.equalsIgnoreCase("dog")||petType.equalsIgnoreCase("cat") || petType.equalsIgnoreCase("bird")) {
	 happinessLevel=happinessLevel+4;
		}
		else if(petType.equalsIgnoreCase("turtle")||petType.equalsIgnoreCase("chinchilla")||petType.equalsIgnoreCase("mouse")) {
		 happinessLevel=happinessLevel+3;
		
		}
		else if(petType.equalsIgnoreCase("hamster")||petType.equalsIgnoreCase("guinea pig")||petType.equalsIgnoreCase("bunny")) {
			 happinessLevel=happinessLevel+5;
		}
		else { happinessLevel=happinessLevel+4;}
		}
	static void play(String petType) {
		 happinessLevel=happinessLevel+3;
	}
	static void walkin(String petType) {
	if(petType.equalsIgnoreCase("dog"))	{
		 happinessLevel=happinessLevel+6;
	}
	else { happinessLevel=happinessLevel+1;}
	}
	}
