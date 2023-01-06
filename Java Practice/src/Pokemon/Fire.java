package Pokemon;
import java.util.Scanner;

public class Fire extends Pokemon {
	
	//Attacks
	int Ember;
	int FireSpin;
	int FireFang;
	
	Fire(){
		Ember = 10;
		FireSpin = 10;
		FireFang = 10;
		Type = "Fire";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	
	void Attack() {
		Scanner fAttack = new Scanner(System.in);
		System.out.println("Choose which attack you want to use: \n 1. Ember \n 2. Fire Spin \n 3. Fire Fang");
		int fAttack1 = -1;
		try{
			fAttack1 = fAttack.nextInt();
			}catch(Exception e) {
				System.out.println("Something Went Wrong");			
				}
	
		switch (fAttack1){
		case -1:
			System.out.println("You broke something, You miss an attack for being silly");
			AttackDamage = 0;
			break;
			
		case 1:
			System.out.println("Ember has been used");
			AttackDamage = Ember;
			break;
		
		case 2:
			System.out.println("Fire Spin has been used");
			AttackDamage = FireSpin;
			break;
			
		case 3:
			System.out.println("Fire Fang has been used");
			AttackDamage = FireFang;
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
			System.out.println("Opponent used Ember");
			AttackDamage = Ember;
		}
		if(b == 2) {
			System.out.println("Opponent used Fire Spin");
			AttackDamage = FireSpin;
		}
		if(b == 3) {
			System.out.println("Opponent used Fire Fang");
			AttackDamage = FireFang;
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

