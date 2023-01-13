package Pokemon;

import java.util.Hashtable;
import java.util.Scanner;

public class Battle {


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
				break;
			}
		
			b.showHP();
			System.out.println("It is your opponents turn!");
			b.botAttack(b);
			a.typeEffect(b, a);
			hpMinus(b,a);
			if(a.feintCheck(a)) {
				System.out.println("Your Pokemon has feinted, you lose!");
				break;
			}
			a.showHP();
		}
	}
}


