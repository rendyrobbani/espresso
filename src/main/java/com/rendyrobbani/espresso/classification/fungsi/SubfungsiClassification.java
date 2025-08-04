package com.rendyrobbani.espresso.classification.fungsi;

public interface SubfungsiClassification extends FungsiClassification {

	String SUBFUNGSI_REGEX_VALUE = "(?!0{2})(\\d{2})";
	String SUBFUNGSI_REGEX_MATCH = FUNGSI_REGEX_MATCH + "\\." + SUBFUNGSI_REGEX_VALUE;
	String SUBFUNGSI_REGEX_GROUP = "^" + SUBFUNGSI_REGEX_MATCH + "$";

	String getSubfungsiCode();

	String getSubfungsiPart();

}