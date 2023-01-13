package Pokemon;

import java.util.Hashtable;
import java.util.Scanner;

public class Battle {
	int hp;
	int AttackDamage;
	
	String Type;
	double Effective = 1.6;
	double NotEffective = 0.625;
	//Creating a dictionary which will be filled with moves for each Pokemon type
    Hashtable<String, Object> attackMoves = new Hashtable<String, Object>();
    //Create the arrays for the moves
    String[] waterMoves = {"Hydro Pump", "Surf", "Water Gun"};
    String[] fireMoves = {"Ember", "Fire Spin", "Fire Fang"};
    String[] electricMoves = {"Volt Switch","Lightning Bolt","Thunder Fang"};
    String[] grassMoves = { "Bullet Seed","Vine Whip","Razor Leaf"};
    /*Create a general array for the attack damage (this will be based on position of moves)
    These are all 10 right now but as new moves are brought in and current ones are edited
    this will change
     */    
    int[] attackDamage = {10,10,10};

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


