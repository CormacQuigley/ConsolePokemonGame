package Pokemon;
import java.util.Scanner;


public class Pokemon {
		int level;
		String pName;
		int hp;
		int AttackDamage;
		String Type;
		
		Pokemon(){
			level = 1;
			hp = (level/100 + 1) * 100;
			hp = Math.round(hp);
		}
		
		void PrintPokemon() {
			System.out.println("Name: " + pName);
			System.out.println("Type: " + Type);
			System.out.println("Level: " + level);
			System.out.println("Health Points: " + hp);
		}
		
		void botAttack() {
			System.out.println("Pokemon Type Wrong...");
		}

		
		void Attack() {
			System.out.println("Pokemon Type Wrong...");
		}
		
		void typeEffect(Pokemon a, Pokemon b) {
			//Neutral Affect types do not need to be here
			
			//Fire and Water
			if(a.Type == "Fire" && b.Type == "Water") {
				b.AttackDamage += b.AttackDamage * 1.6;
				a.AttackDamage += a.AttackDamage * 0.625;
			}
			if(a.Type == "Water" && b.Type == "Fire") {
				a.AttackDamage += a.AttackDamage * 1.6;
				b.AttackDamage += b.AttackDamage * 0.625;
			}
			//Grass and Fire
			if(a.Type == "Grass" && b.Type == "Fire") {
				b.AttackDamage += b.AttackDamage * 1.6;
				a.AttackDamage += a.AttackDamage * 0.625;
			}
			if(a.Type == "Fire" && b.Type == "Grass") {
				a.AttackDamage += a.AttackDamage * 1.6;
				b.AttackDamage += b.AttackDamage * 0.625;
			}
			
			//Grass and Electric
			if(a.Type == "Grass" && b.Type == "Electric") {
				b.AttackDamage += b.AttackDamage * 0.625;
			}
			if(a.Type == "Electric" && b.Type == "Grass") {
				a.AttackDamage += a.AttackDamage * 0.625;
			}
			
			//Water and Electric
			if(a.Type == "Water" && b.Type == "Electric") {
				b.AttackDamage += b.AttackDamage * 1.6;
			}
			if(a.Type == "Electric" && b.Type == "Water") {
				a.AttackDamage += a.AttackDamage * 1.6;
			}
			
			//Water and Grass
			if(a.Type == "Water" && b.Type == "Grass") {
				b.AttackDamage += b.AttackDamage * 1.6;
				a.AttackDamage += a.AttackDamage * 0.625;
			}
			if(a.Type == "Grass" && b.Type == "Water") {
				a.AttackDamage += a.AttackDamage * 1.6;
				b.AttackDamage += b.AttackDamage * 0.625;
			}
		}
		
		void showHP() {
			System.out.println(hp);
		}
		
		void hpMinus(Pokemon a, Pokemon b) {
			b.hp = b.hp - a.AttackDamage;
		}
		
		void Battle(Pokemon a, Pokemon b) {
			while(a.hp > 0 && b.hp > 0) {
				System.out.println("It is your turn!");
				a.Attack();
				a.typeEffect(a, b);
				hpMinus(a,b);
				b.showHP();
				System.out.println("It is your opponents turn!");
				b.botAttack();
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




