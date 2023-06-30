/*
 * Liquid
 * Represents Liquid
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 22.06.2023
 */

package at.campus02.bsd;

// put into drinkss
public class Liquid {

	private String name;
	// volume in l

	private double volume;

	// alcohohl percent (eg 42 )

	private double alcoholPercent;

	public Liquid(String name, double volume, double alcoholPercent) {
		this.name = name;
		this.volume = volume;
		this.alcoholPercent = alcoholPercent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getAlcoholPercent() {
		return alcoholPercent;
	}

	public void setAlcoholPercent(double alcoholPercent) {
		this.alcoholPercent = alcoholPercent;
	}
}