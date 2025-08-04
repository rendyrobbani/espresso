package com.rendyrobbani.espresso.classification.rekening;

public interface RekeningClassification {

	String REKENING1_REGEX_VALUE = "([1-8])";
	String REKENING2_REGEX_VALUE = "([1-9])";
	String REKENING3_REGEX_VALUE = "(0[1-9]|[1-9][0-9])";
	String REKENING4_REGEX_VALUE = "(0[1-9]|[1-9][0-9])";
	String REKENING5_REGEX_VALUE = "(0[1-9]|[1-9][0-9]|00[1-9]|0[1-9][0-9]|[1-9][0-9][0-9])";

}