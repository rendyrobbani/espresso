package com.rendyrobbani.espresso.classification.urusan;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UrusanClassificationFactory {

	@Getter
	private static final class UrusanClassificationImpl implements UrusanClassification {

		private final String urusanPart;

		private final String urusanCode;

		private UrusanClassificationImpl(String urusanPart) {
			this.urusanPart = urusanPart;
			this.urusanCode = urusanPart;
		}

	}

	public static UrusanClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		if (code.matches(UrusanClassification.URUSAN_REGEX_GROUP)) return new UrusanClassificationImpl(code);
		throw new IllegalArgumentException("Invalid code");
	}

}