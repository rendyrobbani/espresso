package com.rendyrobbani.espresso.identify;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Gender {
	LAKI_LAKI(1, "Laki-laki"),
	PEREMPUAN(2, "Perempuan");

	private final Integer value;

	private final String title;

	public static Gender fromValue(Integer value) {
		if (value != null) for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}

	public static Gender fromValue(String value) {
		if (value != null) if (value.matches("^([12])$")) return fromValue(Integer.parseInt(value));
		return null;
	}
}