package wargameame;

public class Card {
	
	private char color = '0';
	private String name = " ";
	private int strength = 0;
	
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		if(color == '\u2660' || color == '\u2666' || color == '\u2665' || color == '\u2663') {
			this.color = color;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		if (strength > 0 && strength < 14) {
			this.strength = strength;
		}
	}

}
