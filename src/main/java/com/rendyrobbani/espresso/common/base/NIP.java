package com.rendyrobbani.espresso.common.base;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.impl.gender.GenderImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface NIP {

	String REGEX = "^(199[0-9]|20[0-2][0-9])(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])(199[0-9]|20[0-2][0-9])(0[1-9]|1[0-2]|21)[12](00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})$";
	DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	int[] BIRTH_DATE_MAP = {0, 8};
	int[] START_DATE_MAP = {8, 14};
	int[] GENDER_MAP = {14, 15};
	int[] NUMBER_MAP = {15, 18};

	default boolean isValid(String value) {
		if (value == null) return false;
		return value.matches(REGEX);
	}

	default boolean isNotValid(String value) {
		return !this.isValid(value);
	}

	String getNIP();

	default String getNIP(boolean beautify) {
		if (this.isNotValid(this.getNIP())) return null;
		if (beautify) return String.join(" "
				, this.getNIP().substring(BIRTH_DATE_MAP[0], BIRTH_DATE_MAP[1])
				, this.getNIP().substring(START_DATE_MAP[0], START_DATE_MAP[1])
				, this.getNIP().substring(GENDER_MAP[0], GENDER_MAP[1])
				, this.getNIP().substring(NUMBER_MAP[0], NUMBER_MAP[1])
		);
		return this.getNIP();
	}

	default LocalDateTime getBirthDate() {
		if (this.isNotValid(this.getNIP())) return null;
		return LocalDateTime.parse(this.getNIP().substring(BIRTH_DATE_MAP[0], BIRTH_DATE_MAP[1]), FORMATTER);
	}

	default LocalDateTime getStartDate() {
		if (this.isNotValid(this.getNIP())) return null;
		var value = this.getNIP().substring(START_DATE_MAP[0], START_DATE_MAP[1]);
		if (value.endsWith("21")) return null;
		return LocalDateTime.parse(value, FORMATTER);
	}

	default Gender getGender() {
		if (this.isNotValid(this.getNIP())) return null;
		return GenderImpl.fromValue(this.getNIP().substring(GENDER_MAP[0], GENDER_MAP[1]));
	}

	default Integer getNumber() {
		if (this.isNotValid(this.getNIP())) return null;
		return Integer.parseInt(this.getNIP().substring(NUMBER_MAP[0], NUMBER_MAP[1]));
	}

}