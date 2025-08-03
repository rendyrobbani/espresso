package com.rendyrobbani.espresso.common.impl.gender;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum GenderEnum implements Gender {
	LAKI_LAKI(1, "Laki-laki"),
	PEREMPUAN(2, "Perempuan");

	private final Integer value;

	private final String title;

	public static Gender fromValue(Integer value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}

	public static Gender fromValue(String value) {
		if (value.matches("^([12])$")) return fromValue(Integer.parseInt(value));
		return null;
	}
}