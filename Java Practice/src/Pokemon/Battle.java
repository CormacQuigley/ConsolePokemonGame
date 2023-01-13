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
			b.showHP();
			System.out.println("It is your opponents turn!");
			b.botAttack(b);
			a.typeEffect(b, a);
			hpMinus(b,a);
			a.showHP();
		}
		if(a.hp <= 0) {
			System.out.println("Your Pokemon has feinted, you lose!");
		}else {
			System.out.println("Your Pokemon has won, you win!");
		}
	}
}


