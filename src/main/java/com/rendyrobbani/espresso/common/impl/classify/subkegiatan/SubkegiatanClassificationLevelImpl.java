package com.rendyrobbani.espresso.common.impl.classify.subkegiatan;

import com.rendyrobbani.espresso.common.data.classify.subkegiatan.SubkegiatanClassificationLevel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SubkegiatanClassificationLevelImpl implements SubkegiatanClassificationLevel {
	URUSAN(1, "Urusan"),
	BIDANG(2, "Bidang"),
	PROGRAM(3, "Program"),
	KEGIATAN(4, "Kegiatan"),
	SUBKEGIATAN(5, "Subkegiatan");

	private final Integer value;

	private final String title;

	public static SubkegiatanClassificationLevel fromValue(Integer value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}
}