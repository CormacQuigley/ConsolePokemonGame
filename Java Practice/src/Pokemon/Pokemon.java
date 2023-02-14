package Pokemon;
import java.util.Hashtable;
import java.util.Scanner;


public class Pokemon {
		int level;
		String pName;
		int hp;
		int AttackDamage;
		
		String type;
		double Effective = 1.6;
		double NotEffective = 0.625;
		
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
		
		  protected Hashtable<String, Object> newattackMoves = new Hashtable<>();

		    void addTypeMoves(String type, Object moves) {
		        newattackMoves.put(type, moves);
		    }
		
		
		
		
		void PrintPokemon() {
			System.out.println("Name: " + pName);
			System.out.println("Type: " + type);
			System.out.println("Level: " + level);
			System.out.println("Health Points: " + hp);
		}
		
		void showHP() {
			System.out.println(hp);
		}
		
		void botAttack(Pokemon b) {
			
			 for (String key : newattackMoves.keySet()) {
			    	//If our Pokemon type is in the dictionary
			        if (b.type.equals(key)) {
			        	//Value equals the key
			            Object value = newattackMoves.get(key);
			            //If the value is an array (It will be)
			            if (value instanceof String[]) {
			            	//Scanner for user input
			            	int min = 0;  
			    			int max = 2; 
			    			
			    			int b2 = (int)(Math.random()*(max-min+1)+min);  
			    			System.out.println("Opponent is attacking...");
			            	
			            	 String[] elements = (String[]) value;
			            	   
			            		System.out.println(elements[b2] + " has been used");
		            			
		            			AttackDamage = attackDamage[b2];
			
			            }
			            }
			        }
		}

		
		void Attack(Pokemon a) {
		    
		  
		    //Go through the keys
		    for (String key : newattackMoves.keySet()) {
		    	//If our Pokemon type is in the dictionary
		        if (a.type.equals(key)) {
		        	//Value equals the key
		            Object value = newattackMoves.get(key);
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
		            			}catch(Exception e) {
		            				System.out.println("You have given the wrong command and your Pokemon has gotten confused and missed!");			
		            				}
		            }
		        }
		    }
		}
		
		void typeCheckNotVEff(Pokemon a, Pokemon b, Hashtable<String,Object> NotVEff) {
			//Go through dictionary for super effective
			for (String key : NotVEff.keySet()) {
				
				if(a.type.equals(key)) {
					 Object value1 = NotVEff.get(key);
					
					 if (value1 instanceof String[]) {
			            	 String[] elements = (String[]) value1;
			            	    for (int i = 0; i < elements.length; i++) {
			            	    	if(elements[i] == b.type)
			            	    		a.AttackDamage *= NotEffective;
			            	        
			            	    }
			            	    
					        } else {
					    	if(b.type.equals(value1)) {
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
				
				if(a.type.equals(key)) {
					 Object value = superEff.get(key);
					 
					 	//If the value is an array
					 if (value instanceof String[]) {
		            	 String[] elements = (String[]) value;
		            	    for (int i = 0; i < elements.length; i++) {
		            	        if(b.type == elements[i]) {
		            	        	a.AttackDamage *= Effective;
		            	        }
		            	    }
		            	    
				        } else {
				    	if(b.type.equals(value)) {
				        a.AttackDamage *= Effective;
				    	}
				    } 
				    System.out.println();
				}
					}
					
				}
		
		 protected Hashtable<String, Object> superEff = new Hashtable<>();
		 protected Hashtable<String, Object> notVEff = new Hashtable<>();

		 void addEff(String type, String[] superEffMoves,String[] notVEffMoves) {
		       superEff.put(type, superEffMoves);
		       notVEff.put(type, notVEffMoves);
		 }
		    
		
		
		
		void typeEffect(Pokemon a, Pokemon b) {
			typeCheckSupEff(a,b, superEff);
			typeCheckNotVEff(a,b,notVEff); 
		}
		
		boolean feintCheck(Pokemon a) {
			if(a.hp <= 0) {
				return true;
			}else {
				return false;
			}
		}

		void levelUp(Pokemon a) {
			a.level += a.hp/100;
		}
		
		
		
		
}



