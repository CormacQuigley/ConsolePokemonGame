package Pokemon;
import java.util.Scanner;

public class Electric extends Pokemon {
	
	//Attacks
	int VoltSwitch;
	int LightningBolt;
	int ThunderFang;
	
	Electric(){
		VoltSwitch = 10;
		LightningBolt = 10;
		ThunderFang = 10;
		Type = "Electric";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	
	void Attack() {
		Scanner lAttack = new Scanner(System.in);
		System.out.println("Choose which attack you want to use: \n 1. Volt Switch \n 2. Lightning Bolt  \n 3. Thunder Fang");
		int lAttack1 = -1;
		try{
			lAttack1 = lAttack.nextInt();
			}catch(Exception e) {
				System.out.println("Something Went Wrong");			
				}
	
		switch (lAttack1){
		case -1:
			System.out.println("You broke something, You miss an attack for being silly");
			AttackDamage = 0;
			break;
			
		case 1:
			System.out.println("Volt Switch has been used");
			AttackDamage = VoltSwitch;
			break;
		
		case 2:
			System.out.println("Lightning Bolt has been used");
			AttackDamage = LightningBolt;
			break;
			
		case 3:
			System.out.println("Thunder Fang has been used");
			AttackDamage = ThunderFang;
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
			System.out.println("Opponent used Volt Switch");
			AttackDamage = VoltSwitch;
		}
		if(b == 2) {
			System.out.println("Opponent used Lightning Bolt");
			AttackDamage = LightningBolt;
		}
		if(b == 3) {
			System.out.println("Opponent used Thunder Fang");
			AttackDamage = ThunderFang;
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

