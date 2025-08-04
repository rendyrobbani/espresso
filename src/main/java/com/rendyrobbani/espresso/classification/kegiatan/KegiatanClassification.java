package com.rendyrobbani.espresso.classification.kegiatan;

import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassification;
import com.rendyrobbani.espresso.classification.program.ProgramClassification;

public interface KegiatanClassification extends ProgramClassification {

	String KEGIATAN_REGEX_VALUE = "([0-9]\\.[0-9]{2})";
	String KEGIATAN_REGEX_GROUP = "^" + String.join("\\.", URUSAN_REGEX_VALUE, BIDANG_REGEX_VALUE, PROGRAM_REGEX_VALUE, KEGIATAN_REGEX_VALUE) + "$";

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