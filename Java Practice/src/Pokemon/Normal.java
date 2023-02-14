package Pokemon;


public class Normal extends Pokemon {
	
	//Attacks
	int BodySlam;
	int HyperBeam;
	int SkullBash;
	
    String[] normalMoves = { "Body Slam","Hyper Beam","Skull Bash"};
    
  //Normal is not very effective against these
    String[] normalNotEff = {"Rock"};

    //Normal super effective against these
    String[] normalSuperEff = {};


	Normal(){
		BodySlam = 10;
		HyperBeam = 10;
		SkullBash = 10;
		type = "Normal";
		addTypeMoves(type, normalMoves);
		addEff(type,normalSuperEff,normalNotEff);

	}
	public String[] getMoves(){
		
		return normalMoves;
	}

	public String[] getSuperEff() {
	return normalSuperEff;
}

	public String[] getNotEff() {
	return normalNotEff;
}
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

