package Pokemon;
import java.util.Scanner;

public class Fire extends Pokemon {
	
	//Attacks
	int Ember;
	int FireSpin;
	int FireFang;
	
	String[] fireMoves = {"Ember", "Fire Spin", "Fire Fang"};
	
	//Fire is not very effective against these
	String[] fireNotEff = {"Fire", "Water", "Rock", "Dragon"};

	//Fire super effective against these
	String[] fireSuperEff = {"Grass", "Ice", "Bug"};


	
	Fire(){
		Ember = 10;
		FireSpin = 10;
		FireFang = 10;
		type = "Fire";
		addTypeMoves(type, fireMoves);
		addEff(type,fireSuperEff,fireNotEff);

	}
	
public String[] getMoves(){
		
		return fireMoves;
	}

String[] getSuperEff() {
	return fireSuperEff;
}

String[] getNotEff() {
	return fireNotEff;
}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
}

