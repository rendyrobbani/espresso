package com.rendyrobbani.espresso.classification.kegiatan;

public interface SubkegiatanClassification extends KegiatanClassification {

	String SUBKEGIATAN_REGEX_VALUE = "([0-9]{4})";
	String SUBKEGIATAN_REGEX_GROUP = "^" + String.join("\\.", URUSAN_REGEX_VALUE, BIDANG_REGEX_VALUE, PROGRAM_REGEX_VALUE, KEGIATAN_REGEX_VALUE, SUBKEGIATAN_REGEX_VALUE) + "$";

	String getSubkegiatanCode();

	String getSubkegiatanPart();

}