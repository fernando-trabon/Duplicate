package main.met;

import main.exeption.ColorException;
import main.exeption.TypeException;

public class Plants {
	
	private int size;
	private Color color;
	private Type type;
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Plants(int size, String color, String type) throws ColorException, TypeException{
		this.size = size;
		this.color = strToColor(color);
		this.type = strToType(type);
	}
	
	
	private Color strToColor(String color) throws ColorException{
		switch (color.toLowerCase()){
		case "blue":
			return Color.Blue;
		case "green":
			return Color.Green;
		case "red":
			return Color.Red;
		case "yellow":
			return Color.Yellow;
		default: throw new ColorException();
			
		}
	}
	
	private Type strToType(String type) throws TypeException{
		switch (type.toLowerCase()){
		case "chamomile":
			return Type.Chamomile;
		case "rose":
			return Type.Rose;
		case "tulipe":
			return Type.Tulipe;
		default: throw new TypeException();
			
		}
	}

	@Override
	public String toString() {
		return "Plants [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
	
	
}
