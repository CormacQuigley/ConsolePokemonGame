package Pokemon;
import java.util.Scanner;
import java.util.Random;

public class Grass extends Pokemon {
	
	//Attacks
	int bulletSeed;
	int VineWhip;
	int RazorLeaf;
	
	String[] grassMoves = { "Bullet Seed","Vine Whip","Razor Leaf"};
	
	//Grass is not very effective against these
	String[] grassNotEff = {"Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"};

	//Grass super effective against these
	String[] grassSuperEff = {"Water", "Ground", "Rock"};

	
	Grass(){
		bulletSeed = 10;
		VineWhip = 10;
		RazorLeaf = 10;
		type = "Grass";
		addTypeMoves(type, grassMoves);
		addEff(type,grassSuperEff,grassNotEff);

	}
	
	public String[] getMoves(){
		
		return grassMoves;
	}
	
	public String[] getSuperEff() {
		return grassSuperEff;
	}

	public String[] getNotEff() {
		return grassNotEff;
	}

	float Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
		
	
}
