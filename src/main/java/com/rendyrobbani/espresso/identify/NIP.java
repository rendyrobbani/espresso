package com.rendyrobbani.espresso.identify;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface NIP {

	String REGEX = "^(199[0-9]|20[0-2][0-9])(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])(199[0-9]|20[0-2][0-9])(0[1-9]|1[0-2]|21)[12](00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})$";
	DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	int[] BIRTH_DATE_MAP = {0, 8};
	int[] START_DATE_MAP = {8, 14};
	int[] GENDER_MAP = {14, 15};
	int[] NUMBER_MAP = {15, 18};

	String getValue();

	default String getValue(boolean beautify) {
		if (this.isNotValid(this.getValue())) return null;
		if (beautify) return String.join(" "
				, this.getValue().substring(BIRTH_DATE_MAP[0], BIRTH_DATE_MAP[1])
				, this.getValue().substring(START_DATE_MAP[0], START_DATE_MAP[1])
				, this.getValue().substring(GENDER_MAP[0], GENDER_MAP[1])
				, this.getValue().substring(NUMBER_MAP[0], NUMBER_MAP[1])
		);
		return this.getValue();
	}

	default boolean isValid(String value) {
		if (value == null) return false;
		return value.matches(REGEX);
	}

	default boolean isNotValid(String value) {
		return !this.isValid(value);
	}

	default LocalDate getBirthDate() {
		if (this.isNotValid(this.getValue())) return null;
		return LocalDate.parse(this.getValue().substring(BIRTH_DATE_MAP[0], BIRTH_DATE_MAP[1]), FORMATTER);
	}

	default LocalDate getStartDate() {
		if (this.isNotValid(this.getValue())) return null;
		var value = this.getValue().substring(START_DATE_MAP[0], START_DATE_MAP[1]);
		if (value.endsWith("21")) return null;
		return LocalDate.parse(value + "01", FORMATTER);
	}

	default Gender getGender() {
		if (this.isNotValid(this.getValue())) return null;
		return Gender.fromValue(this.getValue().substring(GENDER_MAP[0], GENDER_MAP[1]));
	}

	default Integer getNumber() {
		if (this.isNotValid(this.getValue())) return null;
		return Integer.parseInt(this.getValue().substring(NUMBER_MAP[0], NUMBER_MAP[1]));
	}

}