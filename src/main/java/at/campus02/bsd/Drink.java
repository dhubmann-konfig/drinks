/*
 * Drink
 * Represents Drink
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 29.06.2023
 */

package at.campus02.bsd;

/**
 * Abstract base class for concrete drink classes
 *
 * Contains methods to calculate volume, alc/vol and if a drink
 * is alcoholic.
 *
 * @author Caroline Meixner
 */
public abstract class Drink {
    /**
     * name of the drink
     */
    protected String name;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */
    public Drink(String name) {
        this.name = name;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();

    /**
     * Returns name of drink
     *
     * @return name of drink
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of drink
     *
     * @param name name of drink
     */
    public void setName(String name) {
        this.name = name;
    }
}
