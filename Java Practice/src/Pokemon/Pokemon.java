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
	    
		
		Pokemon(){
			level = 1;
			hp = (level/100 + 1) * 100;
			hp = Math.round(hp);
		}
		
		void createTypeDict(Hashtable<String, Object> attackMoves){
			//Add arrays to the dictionary with the types as keys
		    attackMoves.put("Water", waterMoves);
		    attackMoves.put("Fire", fireMoves);
		    attackMoves.put("Electric", electricMoves);
		    attackMoves.put("Grass", grassMoves);
		}
		
		void PrintPokemon() {
			System.out.println("Name: " + pName);
			System.out.println("Type: " + Type);
			System.out.println("Level: " + level);
			System.out.println("Health Points: " + hp);
		}
		
		void showHP() {
			System.out.println(hp);
		}
		
		void botAttack(Pokemon b) {
			createTypeDict(attackMoves);
			
			 for (String key : attackMoves.keySet()) {
			    	//If our Pokemon type is in the dictionary
			        if (b.Type.equals(key)) {
			        	//Value equals the key
			            Object value = attackMoves.get(key);
			            //If the value is an array (It will be)
			            if (value instanceof String[]) {
			            	//Scanner for user input
			            	int min = 0;  
			    			int max = 2; 
			    			
			    			int b2 = (int)(Math.random()*(max-min+1)+min);  
			    			System.out.println("Opponent is attacking...");
			            	
			            	 String[] elements = (String[]) value;
			            	   
			            		System.out.println(elements[b2-1] + " has been used");
		            			
		            			AttackDamage = attackDamage[b2-1];
			
			            }
			            }
			        }
		}

		
		void Attack(Pokemon a) {
		    
		    //Add arrays to the dictionary with the types as keys
			createTypeDict(attackMoves);
		    //Go through the keys
		    for (String key : attackMoves.keySet()) {
		    	//If our Pokemon type is in the dictionary
		        if (a.Type.equals(key)) {
		        	//Value equals the key
		            Object value = attackMoves.get(key);
		            //If the value is an array (It will be)
		            if (value instanceof String[]) {
		            	//Scanner for user input
		            	Scanner Attack = new Scanner(System.in);
		            	System.out.println("Choose which attack you want to use:");
		            	
		            	 String[] elements = (String[]) value;
		            	    for (int i = 0; i < elements.length; i++) {
		            	        System.out.println(i + 1 + ": " + elements[i]);
		            	    }
		            	    
		            	    int Attack1 = -1;
		            		try{
		            			Attack1 = Attack.nextInt();
		            			}catch(Exception e) {
		            				System.out.println("Something Went Wrong");			
		            				}
		            	
		            		System.out.println(elements[Attack1-1] + " has been used");
	            			AttackDamage = attackDamage[Attack1-1];
		            		
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
		        }
		    }
		}
		
		void typeCheckNotVEff(Pokemon a, Pokemon b, Hashtable<String,Object> NotVEff) {
			//Go through dictionary for super effective
			for (String key : NotVEff.keySet()) {
				
				if(a.Type == key) {
					 Object value1 = NotVEff.get(key);
					
					 if (value1 instanceof String[]) {
			            	 String[] elements = (String[]) value1;
			            	    for (int i = 0; i < elements.length; i++) {
			            	    	if(elements[i] == b.Type)
			            	    		a.AttackDamage *= NotEffective;
			            	        
			            	    }
			            	    
					        } else {
					    	if(b.Type == value1) {
					        a.AttackDamage *= NotEffective;
					    	}
					    } 
					    System.out.println();
					}
				}
		}
		void typeCheckSupEff(Pokemon a, Pokemon b, Hashtable<String,Object> superEff) {
			//Go through dictionary for super effective
			for (String key : superEff.keySet()) {
				
				if(a.Type == key) {
					 Object value = superEff.get(key);
					 
					 	//If the value is an array
					 if (value instanceof String[]) {
		            	 String[] elements = (String[]) value;
		            	    for (int i = 0; i < elements.length; i++) {
		            	        if(b.Type == elements[i]) {
		            	        	AttackDamage *= Effective;
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
		
		
		void typeEffect(Pokemon a, Pokemon b) {
			//Neutral Affect types do not need to be here
			//Create a hash table to make a dictionary for super effectives
			Hashtable<String, Object> superEff = new Hashtable<String, Object>();
			//Super Effectives against key
			superEff.put("Water", "Fire");
			superEff.put("Fire", "Grass");
			superEff.put("Grass", "Water");
			superEff.put("Electric", "Water");
			//Create a hash table to make a dictionary for not very effectives
			Hashtable<String, Object> NotVEff = new Hashtable<String, Object>();
			//Use array as it has more than one option
			String[] grassNotvEff = {"Water","Electric","Grass","Fire"};
			String[] fireNotvEff = {"Fire,Water",};
			String[] electricNotvEff = {"Electric,Grass"};
			String[] waterNotvEff = {"Fire,Water"};
			
			//Not Very Effective
			NotVEff.put("Grass", grassNotvEff);
			NotVEff.put("Fire", fireNotvEff);
			NotVEff.put("Electric", electricNotvEff);
			NotVEff.put("Water", waterNotvEff);
			
			typeCheckSupEff(a,b, superEff);
			typeCheckNotVEff(a,b,NotVEff); 
			
		}
		
		
}



