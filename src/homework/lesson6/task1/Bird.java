package homework.lesson6.task1;

public abstract class Bird {
	public String feathers;
	public int layEggs;
	public abstract boolean fly();
	
	
	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	

	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}


	public String getFeathers() {
		return feathers;
	}
	
	public int getLayEggs() {
		return layEggs;
	}
	
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	
	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}
	
}
