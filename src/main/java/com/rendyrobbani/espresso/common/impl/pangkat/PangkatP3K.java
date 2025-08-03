package com.rendyrobbani.espresso.common.impl.pangkat;

import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;
import lombok.Getter;

@Getter
public enum PangkatP3K implements PangkatASN {
	P3K_01("01", "Golongan I"),
	P3K_02("02", "Golongan II"),
	P3K_03("03", "Golongan III"),
	P3K_04("04", "Golongan IV"),
	P3K_05("05", "Golongan V"),
	P3K_06("06", "Golongan VI"),
	P3K_07("07", "Golongan VII"),
	P3K_08("08", "Golongan VIII"),
	P3K_09("09", "Golongan IX"),
	P3K_10("10", "Golongan X"),
	P3K_11("11", "Golongan XI"),
	P3K_12("12", "Golongan XII"),
	P3K_13("13", "Golongan XIII"),
	P3K_14("14", "Golongan XIV"),
	P3K_15("15", "Golongan XV"),
	P3K_16("16", "Golongan XVI"),
	P3K_17("17", "Golongan XVII");

	public static final String REGEX = "0[1-9]|1[0-7]";

	private final String value;

	private final String title;

	private final String roman;

	private final String baseName;

	private final String fullName;

	private final boolean isPNS;

	private final boolean isP3K;

	PangkatP3K(String value, String title) {
		this.value = value;
		this.title = title;

		this.roman = null;
		this.baseName = this.title;
		this.fullName = this.title;

		this.isPNS = false;
		this.isP3K = true;
	}

	public static PangkatP3K fromValue(String value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}
}