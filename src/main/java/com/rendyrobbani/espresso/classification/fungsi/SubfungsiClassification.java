package com.rendyrobbani.espresso.classification.fungsi;

public interface SubfungsiClassification extends FungsiClassification {

	String SUBFUNGSI_REGEX_VALUE = "([0-9]{2})";
	String SUBFUNGSI_REGEX_GROUP = "^" + String.join("\\.", FUNGSI_REGEX_VALUE, SUBFUNGSI_REGEX_VALUE) + "$";

	String getSubfungsiCode();

	String getSubfungsiPart();

}