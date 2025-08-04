package com.rendyrobbani.espresso.classification.rekening;

import lombok.Getter;

import java.util.List;

@Getter
public enum RekeningClassificationType {
	ASET(1, "Aset"),
	KEWAJIBAN(2, "Kewajiban"),
	EKUITAS(3, "Ekuitas"),
	PENDAPATAN(4, "Pendapatan Daerah"),
	BELANJA(5, "Belanja Daerah"),
	PEMBIAYAAN(6, "Pembiayaan Daerah"),
	PENDAPATAN_LO(7, "Pendapatan Daerah-LO"),
	BEBAN(8, "Beban Daerah");

	private final Integer value;

	private final String title;

	private final boolean isNeraca;

	private final boolean isLRA;

	private final boolean isLO;

	RekeningClassificationType(Integer value, String title) {
		this.value = value;
		this.title = title;
		this.isNeraca = List.of(1, 2, 3).contains(value);
		this.isLRA = List.of(4, 5, 6).contains(value);
		this.isLO = List.of(7, 8).contains(value);
	}

	public static RekeningClassificationType fromValue(Integer value) {
		if (value != null) for (var e : values()) if (value.equals(e.value)) return e;
		return null;
	}

	public static RekeningClassificationType fromValue(String value) {
		if (value.matches("[1-6]")) return fromValue(Integer.parseInt(value));
		return null;
	}
}