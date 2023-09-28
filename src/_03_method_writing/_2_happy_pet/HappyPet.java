package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	static int happinessLevel=0;

	public static void main(String[] args) {

		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petType=JOptionPane.showInputDialog("what kind of pet do you want to buy ?");

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		//    Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "what do you want to do with your pet ? ", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "feed", "play", "walk" }, null);

		// 6. Use user input to call the appropriate method created in step 5 below.

		// 7. If you determine the happiness level is large enough, tell the
		//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.	

	static void feed( String pet) {

		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null,"Your dog wags its tail");
		}
		if(pet.equals("horse")) {
			JOptionPane.showMessageDialog(null,"Your horse is whinning");
		}
		if(pet.equals("fish")) {
			JOptionPane.showMessageDialog(null,"Your fish is turning red");
		}
		happinessLevel +=10;
	}

	static void play() {



	}

	static void walk() {



	}
}
