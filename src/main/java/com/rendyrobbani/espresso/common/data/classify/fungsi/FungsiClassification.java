package com.rendyrobbani.espresso.common.data.classify.fungsi;

public interface FungsiClassification {

	String FUNGSI_REGEX_VALUE = "([0-9]{2})";
	String FUNGSI_REGEX_GROUP = "^" + FUNGSI_REGEX_VALUE + "$";
	String SUBFUNGSI_REGEX_VALUE = FUNGSI_REGEX_VALUE + "\\." + "([0-9]{2})";
	String SUBFUNGSI_REGEX_GROUP = "^" + SUBFUNGSI_REGEX_VALUE + "$";

	String getFungsiCode();

	String getFungsiPart();

	String getSubfungsiCode();

	String getSubfungsiPart();

	FungsiClassificationLevel getLevel();

}