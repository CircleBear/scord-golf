package com.circlebear.scord.golf.models;

/**
 * Class that holds information about a golf hole.
 * 
 * @author Dan Wiechert
 */
public class Hole {
	private int yards;
	private int par;
	private int number;

	/**
	 * @return the yards
	 */
	public int getYards() {
		return yards;
	}

	/**
	 * @param yards
	 *            the yards to set
	 */
	public void setYards(final int yards) {
		if (yards <= 0) {
			throw new IllegalArgumentException("Yards must be positive.");
		}
		this.yards = yards;
	}

	/**
	 * @return the par
	 */
	public int getPar() {
		return par;
	}

	/**
	 * @param par
	 *            the par to set
	 */
	public void setPar(final int par) {
		if (par <= 0) {
			throw new IllegalArgumentException("Par must be positive.");
		}
		this.par = par;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(final int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Number must be positive.");
		}
		this.number = number;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + par;
		result = prime * result + yards;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Hole other = (Hole) obj;
		if (number != other.number) {
			return false;
		}
		if (par != other.par) {
			return false;
		}
		if (yards != other.yards) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hole [yards=" + yards + ", par=" + par + ", number=" + number + "]";
	}
}
