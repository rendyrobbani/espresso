package com.rendyrobbani.espresso.classification.urusan;

public interface UrusanClassification {

	String URUSAN_REGEX_VALUE = "(?!0)(X|\\d)";
	String URUSAN_REGEX_MATCH = URUSAN_REGEX_VALUE;
	String URUSAN_REGEX_GROUP = "^" + URUSAN_REGEX_MATCH + "$";

	String getUrusanCode();

	String getUrusanPart();

}