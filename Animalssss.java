
abstract class Animal12
{
	public abstract void sound();
}

class Lion extends Animal12
{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Lion Roars");
	}
	
}

class Tiger extends Animal12
{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Tiger Growls");
	}
	
}

public class Animalssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal12 lion = new Lion();
		Animal12 tig = new Tiger();
		
		lion.sound();
		tig.sound();
		

	}

}
