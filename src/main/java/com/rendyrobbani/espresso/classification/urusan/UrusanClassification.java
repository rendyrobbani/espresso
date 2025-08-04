package com.rendyrobbani.espresso.classification.urusan;

public interface UrusanClassification {

	String URUSAN_REGEX_VALUE = "(X|[0-9])";
	String URUSAN_REGEX_GROUP = "^" + URUSAN_REGEX_VALUE + "$";

	String getUrusanCode();

	String getUrusanPart();

}