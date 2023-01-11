package Pokemon;
import java.util.Scanner;

public class Water extends Pokemon {
	
	//Attacks
	int HydroPump;
	int Surf;
	int WaterGun;
	
	Water(){
		HydroPump = 10;
		Surf = 10;
		WaterGun = 10;
		Type = "Water";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	


