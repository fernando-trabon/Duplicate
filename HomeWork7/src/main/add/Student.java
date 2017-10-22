package main.add;

public class Student {
	
	private String name;
	private Integer course;
//properties for access to these fields
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
//constructor with parameters
	public Student(String name, int i) {
		this.name = name;
		this.course = i;
	}
	
	public Student() {}

	@Override
    public String toString() {
        return "[Course:" + course + ", name: " + name + "]";
    }

	
}



