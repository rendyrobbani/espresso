package com.rendyrobbani.espresso.classification.urusan;

public interface BidangClassification extends UrusanClassification {

	String BIDANG_REGEX_VALUE = "(XX|[0-9]{2})";
	String BIDANG_REGEX_GROUP = "^" + String.join("\\.", URUSAN_REGEX_VALUE, BIDANG_REGEX_VALUE) + "$";

	String getBidangCode();

	String getBidangPart();

}