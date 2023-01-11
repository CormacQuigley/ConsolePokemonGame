package Pokemon;
import java.util.Scanner;
import java.util.Random;

public class Grass extends Pokemon {
	
	//Attacks
	int bulletSeed;
	int VineWhip;
	int RazorLeaf;
	
	Grass(){
		bulletSeed = 10;
		VineWhip = 10;
		RazorLeaf = 10;
		Type = "Grass";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
		
	
}
