package Pokemon;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		boolean chosen = false;
		Electric Pikachu = new Electric();
		Pikachu.pName = "Pikachu";
		
		Water Squirtle = new Water();
		Squirtle.pName = "Squirtle";
		
		
		Grass Bulbasaur = new Grass();
		Bulbasaur.pName = "Bulbasaur";
		
		Fire Charmander = new Fire();
		Charmander.pName = "Charmander";
		
		Pokemon Starter = null;
		System.out.println("Professor Oak: Hello trainer I have been looking forward to seeing you. I hope you are ready to begin your journey!");
		Trainer You = new Trainer();
		You.getName();
		System.out.println("Professor Oak: Its really nice to meet you " + You.Name);
		System.out.println("Professor Oak: " + You.Name + " you are just in luck! I have four starter Pokemon for you to choose from");
	do {
		Scanner pick = new Scanner(System.in);
		System.out.println("Choose which Pokemon you want to be your starter: \n 1. Pikachu \n 2. Charmander \n 3. Squirtle \n 4. Bulbasaur");
		int pick1 = -1;
		try{
			pick1 = pick.nextInt();
			}catch(Exception e) {
				System.out.println("Something Went Wrong");			
				}
	
		switch (pick1){
		case -1:
			System.out.println("You broke something...");
			break;
		case 1:
			System.out.println("Professor Oak: You chose Pikachu");
			Starter = Pikachu;
			chosen = true;
			
			break;
		case 2: 
			System.out.println("Professor Oak: You chose Charmander");
			Starter = Charmander;
			chosen = true;
			;
			break;
		case 3: 
			System.out.println("Professor Oak: You chose Squirtle");
			Starter = Squirtle;
			chosen = true;
			break;
		case 4: 
			System.out.println("Professor Oak: You chose Bulbasaur");
			Starter = Bulbasaur;
			chosen = true;
			break;
		default:
			System.out.println("Professor Oak: This wasn't an option");
		}
	}while(chosen == false);
	
	System.out.println("Professor Oak: Here is what you need to know about your first Pokemon");
	Starter.PrintPokemon();
	System.out.println("Professor Oak: I must be going now! Goodluck on your journey " + You.Name + "\n");
	
	System.out.println("After leaving Proffessor Oaks lab you find yourself upon 4 paths, 1. Stormy Patway, 2. Volcano Valley, 3. Water Lodge and 4. Grassy Plains. Choose which path you will go on by inserting the number.");
	boolean chosen2 = false;
	do {
	Scanner path = new Scanner(System.in);
	int path1 = -1;
	
	try{
		path1 = path.nextInt();
		}catch(Exception e) {
			System.out.println("Something Went Wrong");			
			}
	
	switch (path1){
	case -1:
		System.out.println("You broke something...");
		break;
	case 1:
		System.out.println("You have decided to wonder down the stormy path \n You have encountered a wild Pikachu and it attacks you, you must fight back!");
		Starter.Battle(Starter, Pikachu);
		chosen2 = true;
		break;
	case 2: 
		System.out.println("You have decided to wonder up volcano valley \n You have encountered a wild Charmander and it attacks you, you must fight back!");
		Starter.Battle(Starter, Charmander);
		chosen2 = true;
		break;
	case 3: 
		System.out.println("You have decided to wonder down to water lodge \n You have encountered a wild Squirtle and it attacks you, you must fight back!");
		Starter.Battle(Starter, Squirtle);
		chosen2 = true;
		break;
	case 4: 
		System.out.println("You have decided to wonder to grassy plains \n You have encountered a wild Bulbasuar and it attacks you, you must fight back!");
		Starter.Battle(Starter, Bulbasaur);
		chosen2 = true;
		break;
	default:
		System.out.println("Professor Oak: This wasn't an option");
		break;
	}
	
}while(chosen2 == false);
	
	
	}
}
