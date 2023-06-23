/*
 * DrinkQueue
 * Represents Queue of Drinks
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 22.06.2023
 */

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

public class DrinkQueue implements IQueue {

	private List<Drink> drinks = new ArrayList<Drink>();
	private int maxSize = 5;

	public DrinkQueue(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public boolean offer(String obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String element() {
		// TODO Auto-generated method stub
		return null;
	}

}
