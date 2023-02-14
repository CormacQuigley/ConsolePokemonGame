package Pokemon;


public class Fighting extends Pokemon {
	
	//Attacks
	int CloseCombat;
	int CrossChop;
	int DynamicPunch;
	
    String[] fightingMoves = { "Close Combat","Cross Chop","Dynamic Punch"};
    
  //Fighting is not very effective against these
    String[] fightingNotEff = {"Flying", "Psychic", "Bug", "Rock"};

    //Fighting super effective against these
    String[] fightingSuperEff = {"Normal", "Ice", "Rock", "Dark", "Steel"};


	
	Fighting(){
		CloseCombat = 10;
		CrossChop = 10;
		DynamicPunch = 10;
		type = "Fighting";
		addTypeMoves(type, fightingMoves);
		addEff(type,fightingSuperEff,fightingNotEff);

	}
	
	public String[] getMoves(){
		
		return fightingMoves;
	}
	public String[] getSuperEff() {
		return fightingSuperEff;
	}

	public String[] getNotEff() {
		return fightingNotEff;
	}
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

