package com.circlebear.scord.golf.models;

import java.util.List;

/**
 * Class that holds information about a golf course.
 * 
 * @author Dan Wiechert
 */
public class Course {
	private String name;
	private List<Hole> holes;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Adds a new hole to the course.
	 * 
	 * @param hole
	 *            The hole to add.
	 */
	private void addHole(final Hole hole) {
		for (final Hole addedHole : holes) {
			if (addedHole.getNumber() == hole.getNumber()) {
				throw new IllegalArgumentException("A hole already exists with the number " + hole.getNumber() + ".");
			}
		}
		holes.add(hole);
	}

	/**
	 * @return the holes
	 */
	public List<Hole> getHoles() {
		return holes;
	}

	/**
	 * @param holes
	 *            the holes to set
	 */
	public void setHoles(final List<Hole> holes) {
		this.holes = holes;
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
		result = prime * result + ((holes == null) ? 0 : holes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final Course other = (Course) obj;
		if (holes == null) {
			if (other.holes != null) {
				return false;
			}
		} else if (!holes.equals(other.holes)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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
		return "Course [" + (name != null ? "name=" + name + ", " : "") + (holes != null ? "holes=" + holes : "") + "]";
	}
}
