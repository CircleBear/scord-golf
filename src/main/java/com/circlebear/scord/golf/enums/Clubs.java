package com.circlebear.scord.golf.enums;

/**
 * Enum to hold the different types of clubs.
 * <p/>
 * Information about the different types of clubs was found <a href=http://golftips.golfsmith.com/list-different-types-golf-clubs-uses-2374.html>here.</a>
 * 
 * @author Dan Wiechert
 */
public enum Clubs {
	/** The putter. */
	PUTTER;

	/**
	 * Enum that holds the different types of woods.
	 * 
	 * @author Dan Wiechert
	 */
	public enum WOODS {
		/** The driver. */
		ONE,
		/** The two wood. */
		TWO,
		/** The three wood. */
		THREE,
		/** The four wood. */
		FOUR,
		/** The five wood. */
		FIVE;
	}

	/**
	 * Enum that holds the different types of irons.
	 * 
	 * @author Dan Wiechert
	 */
	public enum IRONS {
		/** The one iron. */
		ONE,
		/** The two iron. */
		TWO,
		/** The three iron. */
		THREE,
		/** The four iron. */
		FOUR,
		/** The five iron. */
		FIVE,
		/** The six iron. */
		SIX,
		/** The seven iron. */
		SEVEN,
		/** The eight iron. */
		EIGHT,
		/** The nine iron. */
		NINE;
	}

	/**
	 * Enum that holds the different types of wedges.
	 * 
	 * @author Dan Wiechert
	 */
	public enum WEDGES {
		/** The sand wedge. */
		SAND,
		/** The loft wedge. */
		LOFT,
		/** The lob wedge. */
		LOB,
		/** The pitching wedge. */
		PITCHING;
	}
}
