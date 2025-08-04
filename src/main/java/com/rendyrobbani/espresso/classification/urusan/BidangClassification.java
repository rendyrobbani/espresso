package com.rendyrobbani.espresso.classification.urusan;

public interface BidangClassification extends UrusanClassification {

	String BIDANG_REGEX_VALUE = "(?!00)(XX|\\d{2})";
	String BIDANG_REGEX_MATCH = URUSAN_REGEX_MATCH + "\\." + BIDANG_REGEX_VALUE;
	String BIDANG_REGEX_GROUP = "^" + BIDANG_REGEX_MATCH + "$";

	String getBidangCode();

	String getBidangPart();

}