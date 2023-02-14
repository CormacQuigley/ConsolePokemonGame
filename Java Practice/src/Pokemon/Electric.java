package Pokemon;
import java.util.Scanner;

public class Electric extends Pokemon {
	
	//Attacks
	int voltSwitch;
	int lightningBolt;
	int thunderFang;
	String[] electricMoves = {"Volt Switch","Lightning Bolt","Thunder Fang"};
	//Electric is not very effective against these
	String[] electricNotEff = {"Ground"};

	//Electric super effective against these
	String[] electricSuperEff = {"Water", "Flying"};

	
	Electric(){
		voltSwitch = 10;
		lightningBolt = 10;
		thunderFang = 10;
		type = "Electric";
		addTypeMoves(type, electricMoves);
		addEff(type,electricSuperEff,electricNotEff);


	}
	
	public String[] getMoves(){
		
		return electricMoves;
	}

	public String[] getSuperEff() {
	return electricSuperEff;
}

	public String[] getNotEff() {
	return electricNotEff;
}


	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

