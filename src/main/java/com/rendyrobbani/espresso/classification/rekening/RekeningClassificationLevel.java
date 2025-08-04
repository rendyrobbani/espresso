package com.rendyrobbani.espresso.classification.rekening;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum RekeningClassificationLevel {
	AKUN(1, "Akun"),
	KELOMPOK(2, "Kelompok"),
	JENIS(3, "Jenis"),
	OBJEK(4, "Objek"),
	RINCIAN(5, "Rincian Objek"),
	SUBRINCIAN(6, "Subrincian Objek");

	private final Integer value;

	private final String title;

	public static RekeningClassificationLevel fromValue(Integer value) {
		if (value != null) for (var e : values()) if (value.equals(e.value)) return e;
		return null;
	}

	public static RekeningClassificationLevel fromValue(String value) {
		if (value.matches("[1-6]")) return fromValue(Integer.parseInt(value));
		return null;
	}
}