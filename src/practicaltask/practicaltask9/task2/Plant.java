package practicaltask.practicaltask9.task2;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color c = stringToColor(color);
		Type t = stringToType(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}

	public int getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}

	public Type getType() {
		return type;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

	private Color stringToColor(String color) throws ColorException {
		switch (color.toUpperCase()) {
		case "BLUE":
			return Color.BLUE;
		case "RED":
			return Color.RED;
		case "WHITE":
			return Color.WHITE;
		default:
			throw new ColorException("Input only color blue, red or white!");
		}
	}

	private Type stringToType(String type) throws TypeException {
		switch (type.toUpperCase()) {
		case "CHLOROPHYTA":
			return Type.CHLOROPHYTA;
		case "STREPTOPHYTA":
			return Type.STREPTOPHYTA;
		default:
			throw new TypeException("Input only CHLOROPHYTA or STREPTOPHYTA!");
		}

	}
}
