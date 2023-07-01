/*
 * Liquid
 * Represents Liquid
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 30.06.2023
 */

package at.campus02.bsd;

/**
 * A Liquid object represents a liquid that is used as a component of a Drink,
 * like a Simple Drink or a Cocktail.
 * 
 * It consists of a name, a volume and an alcohol percentage.
 * 
 * @author Daniel Hubmann
 *
 */
public class Liquid {

	/**
	 * Name of the liquid
	 */
	private String name;

	/**
	 * Volume of the liquid in litres
	 */
	private double volume;

	/**
	 * Alcohol percentage of the liquid
	 */
	private double alcoholPercent;

	/**
	 * Constructs a new liquid object with the specified name, volume and alcohol
	 * perentage.
	 * 
	 * @param name           Name of the liquid
	 * @param volume         Volume of the liquid in litres
	 * @param alcoholPercent Alcohol percentage of the liquid
	 */
	public Liquid(String name, double volume, double alcoholPercent) {
		this.name = name;
		this.volume = volume;
		this.alcoholPercent = alcoholPercent;
	}

	/**
	 * Returns the name of the liquid.
	 * 
	 * @return Name of the liquid
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the liquid.
	 * 
	 * @param name Name of the liquid
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the volume of the liquid in litres.
	 * 
	 * @return Volume of the liquid in litres
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * Sets the volume of the liquid in litres
	 * 
	 * @param volume Volume of the liquid in litres
	 */
	public void setVolume(double volume) {
		this.volume = volume;
	}

	/**
	 * Returns the alcohol percentage of the liquid.
	 * 
	 * @return alcoholPercent Alcohol percentage of the liquid
	 */
	public double getAlcoholPercent() {
		return alcoholPercent;
	}

	/**
	 * Sets the alcohol percentage of the liquid.
	 * 
	 * @param alcoholPercent Alcohol percentage of the liquid
	 */
	public void setAlcoholPercent(double alcoholPercent) {
		this.alcoholPercent = alcoholPercent;
	}
}
