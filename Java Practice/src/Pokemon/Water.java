package Pokemon;
import java.util.Scanner;

public class Water extends Pokemon {
	
	//Attacks
	int HydroPump;
	int Surf;
	int WaterGun;
	
	Water(){
		HydroPump = 10;
		Surf = 10;
		WaterGun = 10;
		Type = "Water";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	
	void Attack() {
		Scanner wAttack = new Scanner(System.in);
		System.out.println("Choose which attack you want to use: \n 1. Hydro Pump \n 2. Surf  \n 3. Water Gun");
		int wAttack1 = -1;
		try{
			wAttack1 = wAttack.nextInt();
			}catch(Exception e) {
				System.out.println("Something Went Wrong");			
				}
	
		switch (wAttack1){
		case -1:
			System.out.println("You broke something, You miss an attack for being silly");
			AttackDamage = 0;
			break;
			
		case 1:
			System.out.println("Volt Switch has been used");
			AttackDamage = HydroPump;
			break;
		
		case 2:
			System.out.println("Lightning Bolt has been used");
			AttackDamage = Surf;
			break;
			
		case 3:
			System.out.println("Thunder Fang has been used");
			AttackDamage = WaterGun;
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
			System.out.println("Opponent used Hydro Pump");
			AttackDamage = HydroPump;
		}
		if(b == 2) {
			System.out.println("Opponent used Surf");
			AttackDamage = Surf;
		}
		if(b == 3) {
			System.out.println("Opponent used Water Gun");
			AttackDamage = WaterGun;
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

