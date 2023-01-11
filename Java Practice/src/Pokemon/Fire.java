package Pokemon;
import java.util.Scanner;

public class Fire extends Pokemon {
	
	//Attacks
	int Ember;
	int FireSpin;
	int FireFang;
	
	Fire(){
		Ember = 10;
		FireSpin = 10;
		FireFang = 10;
		Type = "Fire";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
}

