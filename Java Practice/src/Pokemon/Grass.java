package Pokemon;
import java.util.Scanner;
import java.util.Random;

public class Grass extends Pokemon {
	
	//Attacks
	int bulletSeed;
	int VineWhip;
	int RazorLeaf;
	
	Grass(){
		bulletSeed = 10;
		VineWhip = 10;
		RazorLeaf = 10;
		Type = "Grass";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	
	void Attack() {
		Scanner gAttack = new Scanner(System.in);
		System.out.println("Choose which attack you want to use: \n 1. Bullet Seed \n 2. Vine Whip \n 3. Razor Leaf");
		int gAttack1 = -1;
		try{
			gAttack1 = gAttack.nextInt();
			}catch(Exception e) {
				System.out.println("Something Went Wrong");			
				}
	
		switch (gAttack1){
		case -1:
			System.out.println("You broke something, You miss an attack for being silly");
			AttackDamage = 0;
			break;
			
		case 1:
			System.out.println("Bullet Seed has been used");
			AttackDamage = bulletSeed;
			break;
		
		case 2:
			System.out.println("Vine Whip has been used");
			AttackDamage = VineWhip;
			break;
			
		case 3:
			System.out.println("Razor Leaf has been used");
			AttackDamage = RazorLeaf;
			break;
			
		default:
			System.out.println("This wasn't an option, You miss your attack for being annoying");
			AttackDamage = 0;
			break;
			
		}
		int max = 10;
		int min = 0;
			
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	    
		if(random_int >= 3) {
			System.out.println("Your Attack Hits!");
		}else {
			AttackDamage = 0;
			System.out.println("Oh No! Your attack has missed");
		}
		}
	
	void botAttack() {
		
		int min = 1;  
		int max = 3; 
		
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("Opponent is attacking...");  
		
		if(b == 1) {
			System.out.println("Opponent used Bullet Seed");
			AttackDamage = bulletSeed;
		}
		if(b == 2) {
			System.out.println("Opponent used Vine Whip");
			AttackDamage = VineWhip;
		}
		if(b == 3) {
			System.out.println("Opponent used Razor Leaf");
			AttackDamage = RazorLeaf;
		}
		int max1 = 10;
		int min2 = 0;
			
		int random_int1 = (int)Math.floor(Math.random()*(max1-min2+1)+min2);
	    
		if(random_int1 >= 3) {
			System.out.println("Opponents Attack Hits!");
		}else {
			AttackDamage = 0;
			System.out.println("Opponents attack has missed!");
		}
						
	}
}
