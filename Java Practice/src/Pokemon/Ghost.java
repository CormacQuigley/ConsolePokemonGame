package Pokemon;


public class Ghost extends Pokemon {
	
	//Attacks
	int ShadowBall;
	int Hex;
	int PhantomForce;
	
	String[] ghostMoves = { "Shadow Ball","Hex","Phantom Force"};
	//Ghost is not very effective against these
	String[] ghostNotEff = {"Normal"};

	//Ghost super effective against these
	String[] ghostSuperEff = {"Psychic"};

	
	Ghost(){
		ShadowBall = 10;
		Hex = 10;
		PhantomForce = 10;
		type = "Ghost";
		addTypeMoves(type, ghostMoves);
		addEff(type,ghostSuperEff,ghostNotEff);

	}
	
	public String[] getMoves(){
		
		return ghostMoves;
	}

	public String[] getSuperEff() {
	return ghostSuperEff;
}

	public String[] getNotEff() {
	return ghostNotEff;
}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

