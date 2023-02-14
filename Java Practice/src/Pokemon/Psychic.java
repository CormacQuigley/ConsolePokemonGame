package Pokemon;


public class Psychic extends Pokemon {
	
	//Attacks
	int FutureSight;
	int Psystrike;
	int GlitzyGlow;
	String[] psychicMoves = { "Future Sight","Psystrike","Glitzy Glow"};
	
	//Psychic is not very effective against these
	String[] psychicNotEff = {"Psychic"};

	//Psychic super effective against these
	String[] psychicSuperEff = {"Fighting", "Poison"};

	
	Psychic(){
		FutureSight = 10;
		Psystrike = 10;
		GlitzyGlow = 10;
		type = "Psychic";
		addTypeMoves(type, psychicMoves);
		addEff(type,psychicSuperEff,psychicNotEff);

	}
	
	public String[] getMoves(){
		
		return psychicMoves;
	}

	public String[] getSuperEff() {
	return psychicSuperEff;
}

	public String[] getNotEff() {
	return psychicNotEff;
}
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

