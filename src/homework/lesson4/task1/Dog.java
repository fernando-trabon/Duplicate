package homework.lesson4.task1;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	// Compare three dogs by name

	public static boolean compareThreeDogs(Dog item1, Dog item2, Dog item3) {
		if ((item1.equals(item2)) || (item2.equals(item3)) || (item1.equals(item3))) {
			return true;
		} else {
			return false;
		}

	}
	
	// The oldest dog   
	
	public static void theOldestDog(Dog dog1, Dog dog2, Dog dog3) {
		if (dog1.getAge() > dog2.getAge()) {
			if (dog1.getAge() > dog3.getAge()) {
				System.out.println("The oldest dog: name - " + dog1.getName() + " and breed - " + dog1.getBreed());
			}
		} else if (dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog: name - " + dog2.getName() + " and breed - " + dog2.getBreed());
		} else {
			System.out.println("The oldest dog: name - " + dog3.getName() + " and breed - " + dog3.getBreed());
		}
	}

	// Constructor

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// Getters and Setters

	public String getName() {
		return name;
	}

	public Breed getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// Compare objects by name
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (name.equals(other.name))
			return true;
		return false;
	}

	enum Breed {
		GERMAN_SHEFERD, ROTTWEILER, LABRADOR, SAINT_BERNARD, DOBERMAN
	}
}