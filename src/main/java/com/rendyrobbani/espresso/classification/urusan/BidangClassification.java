package com.rendyrobbani.espresso.classification.urusan;

public interface BidangClassification extends UrusanClassification {

	String BIDANG_REGEX_VALUE = "(?!0{2})(X{2}|\\d{2})";
	String BIDANG_REGEX_MATCH = URUSAN_REGEX_MATCH + "\\." + BIDANG_REGEX_VALUE;
	String BIDANG_REGEX_GROUP = "^(?!X\\.\\d{2}|\\d\\.X{2})" + BIDANG_REGEX_MATCH + "$";

	String getBidangCode();

	String getBidangPart();

}