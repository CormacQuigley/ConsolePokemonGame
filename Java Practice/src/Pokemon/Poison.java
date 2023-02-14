package Pokemon;


public class Poison extends Pokemon {
	
	//Attacks
	int PoisonFang;
	int SludgeBomb;
	int ToxicSpikes;
    String[] poisonMoves = { "Poison Fang","Sludge Bomb","Toxic Spikes"};
    
  //Poison is not very effective against these
    String[] poisonNotEff = {"Poison", "Ground", "Rock", "Ghost"};

    //Poison super effective against these
    String[] poisonSuperEff = {"Grass"};


	Poison(){
		PoisonFang = 10;
		SludgeBomb = 10;
		ToxicSpikes = 10;
		type = "Poison";
		addTypeMoves(type, poisonMoves);
		addEff(type,poisonSuperEff,poisonNotEff);

	}
	
	public String[] getMoves(){
		
		return poisonMoves;
	}

	public String[] getSuperEff() {
	return poisonSuperEff;
}

	public String[] getNotEff() {
	return poisonNotEff;
}
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

