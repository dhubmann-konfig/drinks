/*
 * Cocktail
 * Represents Cocktail
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 27.06.2023
 */

package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink{
    /**
     * list of contained liquids
     */
    protected List<Liquid> liquidList;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name, List<Liquid> liquidList) {
        super(name);
        this.liquidList = liquidList;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : liquidList) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholPercent = 0;
        double alcoholVolume = 0;
        for (Liquid liquid : liquidList) {
            alcoholVolume += (liquid.getAlcoholPercent() / 100) * liquid.getVolume();
        }
        alcoholPercent = alcoholVolume / getVolume();
        return alcoholPercent;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        boolean alcoholic = false;
        for (Liquid liquid : liquidList) {
            if (liquid.getAlcoholPercent() != 0) {
                alcoholic = true;
                break;
            }
        }
        return alcoholic;
    }
}
