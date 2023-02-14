package Pokemon;

import java.util.Hashtable;
import java.util.Scanner;

public class Battle {
	String replay1;


	void hpMinus(Pokemon a, Pokemon b) {
		b.hp = b.hp - a.AttackDamage;
	}
	
	

	
	void startBattle(Pokemon a, Pokemon b) {
		while(a.hp > 0 && b.hp > 0) {
			System.out.println("It is your turn!");
			a.Attack(a);
			a.typeEffect(a, b);
			hpMinus(a,b);
			if(b.feintCheck(b)) { 
				System.out.println("Your Pokemon has won, you win!");
				a.levelUp(a);
				break;
			}
		
			System.out.println("Your Opponents HP is:");
			b.showHP();
			System.out.println("It is your opponents turn!");
			b.botAttack(b);
			b.typeEffect(b, a);
			hpMinus(b,a);
			if(a.feintCheck(a)) {
				System.out.println("Your Pokemon has feinted, you lose!");
				
				System.out.println("Do you want to try again? Type y/n");
				Scanner replay = new Scanner(System.in);
				try{
					replay1 = replay.next();
					replay1.toLowerCase();
					}catch(Exception e) {
						System.out.println("Something Went Wrong");			
						}
				System.out.println(replay1);

				if(replay1.equals("y")) {
					a.hp = (a.level/100 + 1) * 100;
					b.hp = (b.level/100 + 1) * 100;
					startBattle(a,b);
				}
				else if(replay1.equals("n")) {
					System.out.println("Nice try trainer! Maybe next time.");
					a.hp = (a.level/100 + 1) * 100;
					b.hp = (b.level/100 + 1) * 100;
					break;
					
				}else {
					System.out.println("Wrong input, we will take that as a no...");
				}
			}else {
			System.out.println("Your HP is:");
			a.showHP();
			}
		}
	}
}


