package com.rendyrobbani.espresso.classification.fungsi;

public interface FungsiClassification {

	String FUNGSI_REGEX_VALUE = "(?!0{2})(\\d{2})";
	String FUNGSI_REGEX_MATCH = FUNGSI_REGEX_VALUE;
	String FUNGSI_REGEX_GROUP = "^" + FUNGSI_REGEX_VALUE + "$";

	String getFungsiCode();

	String getFungsiPart();

}