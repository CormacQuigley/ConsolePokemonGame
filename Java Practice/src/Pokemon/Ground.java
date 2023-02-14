package Pokemon;


public class Ground extends Pokemon {
	
	//Attacks
	int Earthquake;
	int Dig;
	int Bulldoze;
	
    String[] groundMoves = { "Earthquake","Dig","Bulldoze"};
    
  //Ground is not very effective against these
    String[] groundNotEff = {"Grass", "Bug"};

    //Ground super effective against these
    String[] groundSuperEff = {"Fire", "Electric", "Poison", "Rock"};


	
	Ground(){
		Earthquake = 10;
		Dig = 10;
		Bulldoze = 10;
		type = "Ground";
		addTypeMoves(type, groundMoves);
		addEff(type,groundSuperEff,groundNotEff);

	}
	
	public String[] getMoves(){
		
		return groundMoves;
	}
	
	public String[] getSuperEff() {
		return groundSuperEff;
	}

	public String[] getNotEff() {
		return groundNotEff;
	}
	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

