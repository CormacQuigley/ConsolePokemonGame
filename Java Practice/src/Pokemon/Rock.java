package Pokemon;


public class Rock extends Pokemon {
	
	//Attacks
	int StoneEdge;
	int AncientPower;
	int RockSlide;
	String[] rockMoves = { "Stone Edge","Ancient Power","Rock Slide"};
	
	//Rock is not very effective against these
	String[] rockNotEff = {"Fighting", "Ground", "Steel"};

	//Rock super effective against these
	String[] rockSuperEff = {"Fire", "Ice", "Flying", "Bug"};

	Rock(){
		StoneEdge = 10;
		AncientPower = 10;
		RockSlide = 10;
		type = "Rock";
		addTypeMoves(type, rockMoves);
		addEff(type,rockSuperEff,rockNotEff);

		
	}
	
	public String[] getMoves(){
		
		return rockMoves;
	}

String[] getSuperEff() {
	return rockSuperEff;
}

String[] getNotEff() {
	return rockNotEff;
}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

