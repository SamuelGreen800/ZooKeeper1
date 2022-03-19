
public class Mammal {
	protected int energy;
	
    public int displayEnergy() {
		System.out.println("Energy Level: " + energy);
		return this.energy;
	}

	public Mammal(int energy) {
		this.energy = energy;
	}
}