
abstract class Animal
{
	public abstract void eat();
	public abstract void sleep();
}

class Lion123 extends Animal
{
	public void eat() {
		System.out.println("Lion Eats Flesh");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Lion Sleeps");
	}
}

class Tiger1234 extends Animal 
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger Eats Flesh & Meat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Tiger Sleeps");
	}
	
}

class Deer extends Animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deer Eats Grass");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Deer Sleeps");
	}
	
}


public class Animalsssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal lion = new Lion123();
        Animal tig = new Tiger1234();
        Animal deer = new Deer();
        
        lion.eat();
        lion.sleep();
        
        tig.eat();
        tig.sleep();
        
        deer.eat();
        deer.sleep();
	}

}
