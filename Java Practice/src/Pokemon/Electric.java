package Pokemon;
import java.util.Scanner;

public class Electric extends Pokemon {
	
	//Attacks
	int VoltSwitch;
	int LightningBolt;
	int ThunderFang;
	
	Electric(){
		VoltSwitch = 10;
		LightningBolt = 10;
		ThunderFang = 10;
		Type = "Electric";
	}
	int Test(Pokemon a){
		a.hp += a.hp + 10;
		return a.hp;
	}
	}

