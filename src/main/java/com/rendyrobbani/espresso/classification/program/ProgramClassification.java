package com.rendyrobbani.espresso.classification.program;

import com.rendyrobbani.espresso.classification.urusan.BidangClassification;

public interface ProgramClassification extends BidangClassification {

	String PROGRAM_REGEX_VALUE = "([0-9]{2})";
	String PROGRAM_REGEX_GROUP = "^" + String.join("\\.", URUSAN_REGEX_VALUE, BIDANG_REGEX_VALUE, PROGRAM_REGEX_VALUE) + "$";

	String getProgramCode();

	String getProgramPart();

}