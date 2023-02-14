package Pokemon;
import java.util.Scanner;

public class Water extends Pokemon {
	
	//Attacks
	int HydroPump;
	int Surf;
	int WaterGun;
	String[] waterMoves = new String[] {"Hydro Pump", "Surf", "Water Gun"};
     // Water is not very effective against these
	String[] waterNotEff  = new String[] {"Grass", "Electric", "Dragon"};
     // Water Super effective against these
	String[] waterSuperEff = new String[] {"Ground", "Rock", "Fire"};

    Water() {
    	HydroPump = 10;
    	Surf = 10;
    	WaterGun = 10;
        type = "Water";
        addTypeMoves(type, waterMoves);
        addEff(type,waterSuperEff,waterNotEff);
    }
    
    
	
	
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
}
	


