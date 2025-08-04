package com.rendyrobbani.espresso.identify;

import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum PangkatPNS implements PangkatASN {
	PANGKAT_1A("1A", "Juru Muda"),
	PANGKAT_1B("1B", "Juru Muda Tingkat I"),
	PANGKAT_1C("1C", "Juru"),
	PANGKAT_1D("1D", "Juru Tingkat I"),
	PANGKAT_2A("2A", "Pengatur Muda"),
	PANGKAT_2B("2B", "Pengatur Muda Tingkat I"),
	PANGKAT_2C("2C", "Pengatur"),
	PANGKAT_2D("2D", "Pengatur Tingkat I"),
	PANGKAT_3A("3A", "Penata Muda"),
	PANGKAT_3B("3B", "Penata Muda Tingkat I"),
	PANGKAT_3C("3C", "Penata"),
	PANGKAT_3D("3D", "Penata Tingkat I"),
	PANGKAT_4A("4A", "Pembina"),
	PANGKAT_4B("4B", "Pembina Tingkat I"),
	PANGKAT_4C("4C", "Pembina Utama Muda"),
	PANGKAT_4D("4D", "Pembina Utama Madya"),
	PANGKAT_4E("4E", "Pembina Utama");

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
		if (value != null) for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}
}