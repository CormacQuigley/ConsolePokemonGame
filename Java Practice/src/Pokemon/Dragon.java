package Pokemon;

public class Dragon extends Pokemon {
	//Attacks
		int dracoMeteor;
		int outRage;
		int dragonBreath;
		
		String[] dragonMoves = { "Draco Meteor","Outrage","Dragon Breath"};
		
		//Dragon is not very effective against these
		String[] dragonNotEff = {"Steel"};

		//Dragon super effective against these
		String[] dragonSuperEff = {"Dragon"};

		
		Dragon(){
			dracoMeteor = 10;
			outRage = 10;
			dragonBreath = 10;
			type = "Dragon";
			addTypeMoves(type, dragonMoves);
			addEff(type,dragonSuperEff,dragonNotEff);

		}
		
		public String[] getMoves(){
			
			return dragonMoves;
		}
		
		public String[] getSuperEff() {
			return dragonSuperEff;
		}

		public String[] getNotEff() {
			return dragonNotEff;
		}
		
		float Test(Pokemon a){
			a.hp += a.hp + 10;
			return a.hp;
		}
}
