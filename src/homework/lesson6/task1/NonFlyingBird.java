package homework.lesson6.task1;

public class NonFlyingBird extends Bird{

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public boolean fly() {
		return false;
	}

}
