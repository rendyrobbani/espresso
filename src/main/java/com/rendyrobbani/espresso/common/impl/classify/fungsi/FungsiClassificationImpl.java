package com.rendyrobbani.espresso.common.impl.classify.fungsi;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassification;
import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassificationLevel;
import lombok.Getter;

@Getter
public final class FungsiClassificationImpl implements FungsiClassification {

	private final String fungsiPart;

	private final String fungsiCode;

	private final String subfungsiPart;

	private final String subfungsiCode;

	private final FungsiClassificationLevel level;

	public FungsiClassificationImpl(String fungsiPart, String subfungsiPart, FungsiClassificationLevel level) {
		this.fungsiPart = fungsiPart;
		this.fungsiCode = fungsiPart;
		this.subfungsiPart = subfungsiPart;
		this.subfungsiCode = subfungsiPart != null ? this.fungsiCode + "." + subfungsiPart : null;
		this.level = level;
	}

	public FungsiClassificationImpl(String fungsiPart, FungsiClassificationLevel level) {
		this(fungsiPart, null, level);
	}

}