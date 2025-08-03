package com.rendyrobbani.espresso.common.data.classify.subkegiatan;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassification;

public interface SubkegiatanClassification {

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