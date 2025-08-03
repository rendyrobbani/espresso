package com.rendyrobbani.espresso.common.impl.classify.fungsi;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassificationLevel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum FungsiClassificationLevelImpl implements FungsiClassificationLevel {
	FUNGSI(1, "Fungsi"),
	SUBFUNGSI(2, "Subfungsi");

	private final Integer value;

	private final String title;

	public static FungsiClassificationLevel fromValue(Integer value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}
}