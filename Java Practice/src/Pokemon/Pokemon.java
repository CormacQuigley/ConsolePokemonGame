package Pokemon;
import java.util.Hashtable;
import java.util.Scanner;


public class Pokemon {
		int level;
		String pName;
		int hp;
		int AttackDamage;
		String Type;
		double Effective = 1.6;
		double NotEffective = 0.625;
		
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
		
		void typeCheckSupEff(Pokemon a, Pokemon b, Hashtable<String,Object> superEff) {
			//Go through dictionary for super effective
			for (String key : superEff.keySet()) {
				
				if(a.Type == key) {
					 Object value = superEff.get(key);
					 	//If the value is an array
					    if (value instanceof String[]) {
					        for (String element : (String[]) value) {
					            if(b.Type == value) {
					            	a.AttackDamage *= Effective;
					            }
					        }
					    } else {
					    	if(b.Type == value) {
					        a.AttackDamage *= Effective;
					    	}
					    }
					    System.out.println();
					}
					
				}
		}
		
		void typeCheckNotVEff(Pokemon a, Pokemon b, Hashtable<String,Object> NotVEff) {
			//Go through dictionary for super effective
			for (String key : NotVEff.keySet()) {
				
				if(a.Type == key) {
					 Object value = NotVEff.get(key);
					 	//If the value is an array
					    if (value instanceof String[]) {
					        for (String element : (String[]) value) {
					            if(b.Type == value) {
					            	
					            	a.AttackDamage *= NotEffective;
					            }
					        }
					    } else {
					    	if(b.Type == value) {
					        
					        a.AttackDamage *= NotEffective;
					    	}
					    }
					    System.out.println();
					}
					
				}
		}
		
		
		void typeEffect(Pokemon a, Pokemon b) {
			//Neutral Affect types do not need to be here
			
			//Create a hash table to make a dictionary for super effectives
			Hashtable<String, Object> superEff = new Hashtable<String, Object>();
			
			//Create because there is two super effective types to water currently
			
			
			//Super Effectives against key
			superEff.put("Water", "Fire");
			superEff.put("Fire", "Grass");
			superEff.put("Grass", "Water");
			superEff.put("Electric", "Water");
			
			
			//Create a hash table to make a dictionary for not very effectives
			Hashtable<String, Object> NotVEff = new Hashtable<String, Object>();
			//Use array as it has more than one option
			String[] grassNotvEff = {"Water","Electric"};
			String[] fireNotvEff = {"Fire,Water"};
			String[] electricNotvEff = {"Electric,Grass"};
			String[] waterNotvEff = {"Fire,Water"};
			
			//Not Very Effective
			NotVEff.put("Grass", grassNotvEff);
			NotVEff.put("Fire", fireNotvEff);
			NotVEff.put("Electric", electricNotvEff);
			NotVEff.put("Water", waterNotvEff);
			
			typeCheckSupEff(a,b, superEff);
			typeCheckSupEff(b,a, superEff);
			typeCheckNotVEff(a,b,NotVEff);
			typeCheckNotVEff(b,a,NotVEff);
			
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




