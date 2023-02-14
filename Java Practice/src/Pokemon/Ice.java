package Pokemon;


public class Ice extends Pokemon {
	
	//Attacks
	int Blizzard;
	int IceBeam;
	int IceBall;
	
    String[] iceMoves = { "Blizzard","Ice Beam","Ice Ball"};
    
  //Ice is not very effective against these
    String[] iceNotEff = {"Fire", "Water", "Ice"};

    //Ice super effective against these
    String[] iceSuperEff = {"Grass", "Ground", "Flying", "Dragon"};


	
	Ice(){
		Blizzard = 10;
		IceBeam = 10;
		IceBall = 10;
		type = "Ice";
		addTypeMoves(type, iceMoves);
		addEff(type,iceSuperEff,iceNotEff);

	}
	
	public String[] getMoves(){
		
		return iceMoves;
	}

	public String[] getSuperEff() {
	return iceSuperEff;
}

	public String[] getNotEff() {
	return iceNotEff;
}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

