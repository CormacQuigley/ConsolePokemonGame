package Pokemon;


public class Flying extends Pokemon {
	
	//Attacks
	int AerialAce;
	int DrillPeck;
	int BraveBird;
	
    String[] flyingMoves = { "Aerial Ace","Drill Peck","Brave Bird"};
  //Flying is not very effective against these
    String[] flyingNotEff = {"Rock", "Steel", "Electric"};

    //Flying super effective against these
    String[] flyingSuperEff = {"Grass", "Fighting", "Bug"};


	
	Flying(){
		AerialAce = 10;
		DrillPeck = 10;
		BraveBird = 10;
		type = "Flying";
		addTypeMoves(type, flyingMoves);
		addEff(type,flyingSuperEff,flyingNotEff);

	}
	
	public String[] getMoves(){
		
		return flyingMoves;
	}
	
	public String[] getSuperEff() {
		return flyingSuperEff;
	}

	public String[] getNotEff() {
		return flyingNotEff;
	}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

