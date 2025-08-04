package com.rendyrobbani.espresso.classification.kegiatan;

import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassification;
import com.rendyrobbani.espresso.classification.program.ProgramClassification;

public interface KegiatanClassification extends ProgramClassification {

	String KEGIATAN_REGEX_VALUE = "((?!0)\\d\\.(?!0{2})\\d{2})";
	String KEGIATAN_REGEX_MATCH = PROGRAM_REGEX_MATCH + "\\." + KEGIATAN_REGEX_VALUE;
	String KEGIATAN_REGEX_GROUP = "^(?!X\\.\\d{2}.{8}|\\d\\.X{2}.{8})" + KEGIATAN_REGEX_MATCH + "$";

	String getKegiatanCode();

	String getKegiatanPart();

	SubfungsiClassification getSubfungsi();

	default String getSubfungsiCode() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getSubfungsiCode();
	}

	default String getSubfungsiPart() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getSubfungsiPart();
	}

}