package com.rendyrobbani.espresso.classification.kegiatan;

public interface SubkegiatanClassification extends KegiatanClassification {

	String SUBKEGIATAN_REGEX_VALUE = "(?!0{4}$)(\\d{4})";
	String SUBKEGIATAN_REGEX_MATCH = KEGIATAN_REGEX_MATCH + "\\." + SUBKEGIATAN_REGEX_VALUE;
	String SUBKEGIATAN_REGEX_GROUP = "^" + SUBKEGIATAN_REGEX_MATCH + "$";

	String getSubkegiatanCode();

	String getSubkegiatanPart();

}