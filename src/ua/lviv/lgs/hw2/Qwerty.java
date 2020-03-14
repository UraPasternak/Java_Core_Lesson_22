package ua.lviv.lgs.hw2;

public class Qwerty {
	int ag;
	int veg;
	int ghj;
	
	public Qwerty(int ag, int veg){
		this.ag = ag;
		this.veg = veg;
	}
	
	public Qwerty(int ag, int veg, int ghj){
		this(ag,veg);
		this.ghj = ghj;
	}

	@Override
	public String toString() {
		return "Qwerty [ag=" + ag + ", veg=" + veg + ", ghj=" + ghj + "]";
	}
}
