package animal;

public class SampleExe{
	public static void main(String[] args){
		Animal a1 = new Lion();
		Animal a2 = new Dog();
		Animal a3 = new Cat();

		a1.speek();	// がおー
		a2.speek();	// わん
		a3.speek();	// にゃー
	}
}

