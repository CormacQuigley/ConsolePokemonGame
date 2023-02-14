package Pokemon;


public class Bug extends Pokemon {
	
	//Attacks
	int signalBeam;
	int lunge;
	int firstImpression;
	
	String[] bugMoves = { "Signal Beam","Lunge","First Impression"};
	//Bug is not very effective against these
	String[] bugNotEff = {"Fighting", "Flying", "Rock", "Fire"};

	//Bug super effective against these
	String[] bugSuperEff = {"Grass", "Psychic"};


	
	Bug(){
		signalBeam = 10;
		lunge = 10;
		firstImpression = 10;
		type = "Bug";
		addTypeMoves(type, bugMoves);
		addEff(type,bugSuperEff,bugNotEff);
	}
	
public String[] getMoves(){
		
		return bugMoves;
	}

public String[] getSuperEff() {
	return bugSuperEff;
}

public String[] getNotEff() {
	return bugNotEff;
}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

