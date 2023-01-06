package Pokemon;

import java.util.Scanner;

public class Trainer {
	String Name;
	
	
	void getName() {
		Scanner getName = new Scanner(System.in);
		System.out.println("Tell me your name trainer!");
		String Name1 = null;
		try{
			Name1 = getName.nextLine();
			}catch(Exception e) {
				System.out.println("Thats not a proper name. Give me a real one.");			
				}
		Name = Name1;
	}
}
