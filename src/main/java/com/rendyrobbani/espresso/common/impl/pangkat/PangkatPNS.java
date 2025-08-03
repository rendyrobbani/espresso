package com.rendyrobbani.espresso.common.impl.pangkat;

import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;
import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.Getter;

@Getter
public enum PangkatPNS implements PangkatASN {
	PNS_1A("1A", "Juru Muda"),
	PNS_1B("1B", "Juru Muda Tingkat I"),
	PNS_1C("1C", "Juru"),
	PNS_1D("1D", "Juru Tingkat I"),
	PNS_2A("2A", "Pengatur Muda"),
	PNS_2B("2B", "Pengatur Muda Tingkat I"),
	PNS_2C("2C", "Pengatur"),
	PNS_2D("2D", "Pengatur Tingkat I"),
	PNS_3A("3A", "Penata Muda"),
	PNS_3B("3B", "Penata Muda Tingkat I"),
	PNS_3C("3C", "Penata"),
	PNS_3D("3D", "Penata Tingkat I"),
	PNS_4A("4A", "Pembina"),
	PNS_4B("4B", "Pembina Tingkat I"),
	PNS_4C("4C", "Pembina Utama Muda"),
	PNS_4D("4D", "Pembina Utama Madya"),
	PNS_4E("4E", "Pembina Utama");

	public static final String REGEX = "[1-4][A-D]|4E";

	private final String value;

	private final String title;

	private final String roman;

	private final String baseName;

	private final String fullName;

	private final boolean isPNS;

	private final boolean isP3K;

	PangkatPNS(String value, String title) {
		this.value = value;
		this.title = title;

		this.roman = NumberUtil.toRoman(this.getValue().substring(0, 1)) + "/" + this.getValue().substring(1).toLowerCase();
		this.baseName = this.title;
		this.fullName = this.title + " (" + this.roman + ")";

		this.isPNS = true;
		this.isP3K = false;
	}

	public static PangkatPNS fromValue(String value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}
}