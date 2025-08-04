package com.rendyrobbani.espresso.classification.fungsi;

public interface FungsiClassification {

	String FUNGSI_REGEX_VALUE = "([0-9]{2})";
	String FUNGSI_REGEX_GROUP = "^" + FUNGSI_REGEX_VALUE + "$";

	String getFungsiCode();

	String getFungsiPart();

}