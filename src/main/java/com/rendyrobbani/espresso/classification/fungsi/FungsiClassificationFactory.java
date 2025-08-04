package com.rendyrobbani.espresso.classification.fungsi;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FungsiClassificationFactory {

	@Getter
	private static final class FungsiClassificationImpl implements FungsiClassification {

		private final String fungsiPart;

		private final String fungsiCode;

		private FungsiClassificationImpl(String fungsiPart) {
			this.fungsiPart = fungsiPart;
			this.fungsiCode = fungsiPart;
		}

	}

	public static FungsiClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		if (code.matches(FungsiClassification.FUNGSI_REGEX_GROUP)) return new FungsiClassificationImpl(code);
		throw new IllegalArgumentException("Invalid code");
	}

}