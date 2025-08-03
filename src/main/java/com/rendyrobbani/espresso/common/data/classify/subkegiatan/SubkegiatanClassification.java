package com.rendyrobbani.espresso.common.data.classify.subkegiatan;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassification;

public interface SubkegiatanClassification {

	String URUSAN_REGEX_VALUE = "([X0-9])";
	String URUSAN_REGEX_GROUP = "^" + URUSAN_REGEX_VALUE + "$";
	String BIDANG_REGEX_VALUE = URUSAN_REGEX_VALUE + "\\." + "([X0-9]{2})";
	String BIDANG_REGEX_GROUP = "^" + BIDANG_REGEX_VALUE + "$";
	String PROGRAM_REGEX_VALUE = BIDANG_REGEX_VALUE + "\\." + "([0-9]{2})";
	String PROGRAM_REGEX_GROUP = "^" + PROGRAM_REGEX_VALUE + "$";
	String KEGIATAN_REGEX_VALUE = PROGRAM_REGEX_VALUE + "\\." + "([0-9]\\.[0-9]{2})";
	String KEGIATAN_REGEX_GROUP = "^" + KEGIATAN_REGEX_VALUE + "$";
	String SUBKEGIATAN_REGEX_VALUE = KEGIATAN_REGEX_VALUE + "\\." + "([0-9]{4})";
	String SUBKEGIATAN_REGEX_GROUP = "^" + SUBKEGIATAN_REGEX_VALUE + "$";

	String getUrusanPart();

	String getUrusanCode();

	String getBidangPart();

	String getBidangCode();

	String getProgramPart();

	String getProgramCode();

	String getKegiatanPart();

	String getKegiatanCode();

	String getSubkegiatanPart();

	String getSubkegiatanCode();

	SubkegiatanClassificationLevel getLevel();

	FungsiClassification getFungsi();

	default String getFungsiCode() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getFungsiCode();
	}

	default String getFungsiPart() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getFungsiPart();
	}

	default String getSubfungsiCode() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getSubfungsiCode();
	}

	default String getSubfungsiPart() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getSubfungsiPart();
	}

}