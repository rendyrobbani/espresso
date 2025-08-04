package com.rendyrobbani.espresso.classification.program;

import com.rendyrobbani.espresso.classification.urusan.BidangClassification;

public interface ProgramClassification extends BidangClassification {

	String PROGRAM_REGEX_VALUE = "(?!0{2})(\\d{2})";
	String PROGRAM_REGEX_MATCH = BIDANG_REGEX_MATCH + "\\." + PROGRAM_REGEX_VALUE;
	String PROGRAM_REGEX_GROUP = "^(?!X\\.\\d{2}.{3}|\\d\\.X{2}.{3})" + PROGRAM_REGEX_MATCH + "$";

	String getProgramCode();

	String getProgramPart();

}